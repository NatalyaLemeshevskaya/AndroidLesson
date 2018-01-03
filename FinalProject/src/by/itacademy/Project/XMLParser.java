package by.itacademy.Project;

import by.itacademy.Project.entity.Goods;
import by.itacademy.Project.entity.Root;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class XMLParser implements Parser {
    private static final String Link = "http://kiparo.ru/t/shop.xml";
    DownLoader downLoader = new DownLoader();

    @Override
    public Root parse(String file) {

        downLoader.Loader(Link,file);
        Document dom;

        try {
            //открываем xml файл
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            dom = builder.parse(file);

            Root root = new Root();

            //===парсинг xml===
            //получаем главный, самый первый элемент из файла
            Element rootElement = dom.getDocumentElement();

            String nameFile = rootElement.getElementsByTagName("name").item(0).getTextContent();
            String location = rootElement.getElementsByTagName("location").item(0).getTextContent();
            List<String> emails = new ArrayList<>();
//
//            NodeList elementsNodeList = rootElement.getElementsByTagName("emails").item(0).getChildNodes();
//            for(int i = 0;i<elementsNodeList.getLength();i++){
//                Node node = elementsNodeList.item(i);
//                if(node.getNodeType() != Node.ELEMENT_NODE){
//                    continue;
//                }
//
//                Element element = (Element) node;
//                String email = element.getElementsByTagName("emails").item(0).getTextContent();
//                emails.add(email);
//
//            }


            root.setName(nameFile);
            root.setLocation(location);
            root.setEmails(emails);






        NodeList nodeList = rootElement.getElementsByTagName("goodsOfShop").item(0).getChildNodes();

        List<Goods> goods= new ArrayList<>();

        for(int i =0;i<nodeList.getLength();i++){

            Node node = nodeList.item(i);
            if(node.getNodeType() != Node.ELEMENT_NODE){
                continue;
            }

            Element element = (Element) node;

            String idString = element.getElementsByTagName("id").item(0).getTextContent();
            int id = Integer.valueOf(idString);

            String name = element.getElementsByTagName("name").item(0).getTextContent();

            String description = element.getElementsByTagName("description").item(0).getTextContent();

            String priceString = element.getElementsByTagName("price").item(0).getTextContent();
            int price = Integer.valueOf(priceString);

            String visibleString = element.getElementsByTagName("visible").item(0).getTextContent();
            boolean visible = Boolean.valueOf(visibleString);

            String yearStr = element.getElementsByTagName("year").item(0).getTextContent();
            Date year = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(yearStr);


            Goods good = new Goods();
            good.setName(name);
            good.setId(id);
            good.setDescription(description);
            good.setPrice(price);
            good.setVisible(visible);
            good.setYear(year);

            goods.add(good);


        }
        root.setGoods(goods);
        System.out.println(root.toString());

        }catch (Exception e){
            System.out.println("Невозможно открыть xml  "+e.toString());

        }

        return null;
    }
}
