package by.itacademy.Test;

import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import javafx.collections.transformation.FilteredList;
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
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {

    private static final String FILENAME = "music.xml";

    public static void main(String[] args) throws ParserConfigurationException, TransformerException {

        List<Mp3File> mp3FileList = new ArrayList();

        for(String item : args){
            Folder folder = new Folder();
            folder.setPath(item);
            File musicBox = new File(folder.getPath());
            File[] files  = musicBox.listFiles();
            for(File file: files){
                Pattern p = Pattern.compile(".+[.mp3]");
                Matcher m = p.matcher(file.getName());
                if (m.matches()) {
                    try {
                        mp3FileList.add(new Mp3File(file.getAbsolutePath()));
                    } catch (IOException e) {

                    } catch (UnsupportedTagException e) {

                    } catch (InvalidDataException e) {

                    }

                }
            }


        }

            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element file = document.createElement("file");
            document.appendChild(file);

        for(int i = 0; i<mp3FileList.size();i++) {

            Element music = document.createElement("music");
            file.appendChild(music);

            Element name = document.createElement("name");
            name.setTextContent(mp3FileList.get(i).getId3v2Tag().getTitle());
            music.appendChild(name);

            Element path = document.createElement("path");
            path.setTextContent(mp3FileList.get(i).getFilename());
            music.appendChild(path);

            long sizeLong = mp3FileList.get(i).getLengthInSeconds();
            String sizeString = String.valueOf(sizeLong);

            Element size = document.createElement("size");
            size.setTextContent(sizeString);
            music.appendChild(size);

            Date date = new Date(mp3FileList.get(i).getLastModified());
            String dateString = String.valueOf(date);

            Element datetime = document.createElement("datetime");
            datetime.setTextContent(dateString);
            music.appendChild(datetime);


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
