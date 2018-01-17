package by.itacademy.Task;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final String FILENAME = "test.xml";
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {

        Map<String,List<File>> fileMap = new HashMap<>();

        for(String item : args){
            Folder folder = new Folder();
            folder.setPath(item);
            File musicBox = new File(folder.getPath());
            File[] files  = musicBox.listFiles();

            for(File file: files){
                Pattern p = Pattern.compile("(.+)\\.(.\\w+)$");
                Matcher m = p.matcher(file.getName());

                if (m.matches()) {

                    List<File> fileList = new ArrayList<>();
                    if(fileMap.containsKey(m.group(2))){
                        fileList = fileMap.get(m.group(2));
                        fileList.add(file);

                        fileMap.replace(m.group(2),fileMap.get(m.group(2)),fileList);
                    } else {
                        fileList.add(file);
                        fileMap.put(m.group(2),fileList);
                    }
                }
            }

        }
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        Element files = document.createElement("files");
        document.appendChild(files);

        for(HashMap.Entry<String,List<File>> entry : fileMap.entrySet()){

            Element ext = document.createElement("ext");
            Attr name = document.createAttribute("name");

            name.setTextContent(entry.getKey());
            ext.setAttributeNode(name);


            for (File pathFile : entry.getValue()) {
                Element file = document.createElement("file");
                file.setTextContent(pathFile.getAbsolutePath());
                ext.appendChild(file);
            }

            files.appendChild(ext);

        }

        Transformer transformer = TransformerFactory.newInstance()
                .newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(
                new File(System.getProperty("user.dir")
                        + File.separator + FILENAME));



        transformer.transform(source, result);

        System.out.println("Документ сохранен!");




    }
}
