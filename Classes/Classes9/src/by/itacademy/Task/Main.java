package by.itacademy.Task;

import by.itacademy.Task.entity.People;
import by.itacademy.Task.entity.Root;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    private static final String Link = "http://kiparo.ru/t/test.json";
    public static void main(String[] args) {

        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;

        try{
            URL url = new URL(Link);
            //класс,позвол получить соединения
//Чтобы получить объект класса HttpURLConnection, следует вызвать метод openConnection()
// для объекта типа URL, но результат нужно привести к типу HttpURLConnection.
            HttpURLConnection httpURLConnection =
                    (HttpURLConnection) url.openConnection();

//необходимо убедиться, что соединение по протоколу HTTP действительно установлено.
            int responceCode = httpURLConnection.getResponseCode();//вытягиваем код ответа
            if(responceCode == HttpURLConnection.HTTP_OK){//успешно подключились

                inputStream = httpURLConnection.getInputStream();
                              // url.openStream();
                File file  = new File("test.json");
                fileOutputStream = new FileOutputStream(file);//канал между одним источником и др

                int byteRead =-1;//сколько реальных данных получили
                byte[] buffer = new byte[2048];//создаем буфер,массив байтов

                while ((byteRead = inputStream.read(buffer))!=-1){//вытягиваем инфу по байтам
                    fileOutputStream.write(buffer, 0, byteRead);
                }



            // parseXml();
               // parseJson();
                parseGson();




            }else{
                System.out.println("Данные не найдены, responce code = "+ responceCode);
            }


        }catch (Exception e){
            System.out.println("невозможно скачать файл, error"+e.toString());

        }finally {
            if(inputStream !=null){
            try{inputStream.close();
            }catch (IOException e){
                System.out.println("Невозможно закрыт файл inputStream ");
            }

            }if(fileOutputStream!= null){
                try {
                    fileOutputStream.close();
                }catch (IOException e){
                    System.out.println("Невозможно закрыт файл fileOutputStream ");

                }
            }

        }

    }

    //парсим данные, те переводим в норм формат


    public static void parseXml(){

        //SAX
        Document dom;

        try{
            //открываем xml файл
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            dom = builder.parse("test.xml");
        }catch (Exception e){
            System.out.println("Невозможно открыть xml  "+e.toString());
            return;
        }
        //наш обьект, который мы будем заполнять данными из xml
        Root root = new Root();

        //===парсинг xml===
        //получаем главный, самый первый элемент из файла
        Element rootElement = dom.getDocumentElement();
        System.out.println("root tag name = "+rootElement.getTagName());

       //получаем элемент по названию, в данном случае вытяниваем тег name
       // NodeList nameNodeList = rootElement.getElementsByTagName("name");

        //так как в теге не может быть много других тегов, мы изначально получаем массив
        //так мы узнаем что у нас нет содежимого в name
        //берем первый элемент
       // Node nameNode = nameNodeList.item(0);
       // System.out.println("name tag name = "+nameNode.getNodeName());

        //получаем содержимое тега name
        String nameFile = rootElement.getElementsByTagName("name").item(0).getTextContent();
       // String nameFile = nameNode.getTextContent();
       // System.out.println("content tag name = " +nameNode.getTextContent());
        //заполняем наш обьект Root
        root.setName(nameFile);

        //===парсим People====

        //получаем элемент по названию, в данном случае вытяниваем тег name
//        NodeList peopleList = rootElement.getElementsByTagName("people");
//        Node peopleNode = peopleList.item(0);


        //получаем из тега people все содержимое people, те массив элкментов elements
        //один элемент их  elementsNodeList это один тег element
        NodeList elementsNodeList = rootElement.getElementsByTagName("people").item(0).getChildNodes();


        List<People> peoples = new ArrayList<>();
        //обходим всех people, точнее elements
        for(int i =0;i<elementsNodeList.getLength();i++){

            Node node = elementsNodeList.item(i);
            if(node.getNodeType() != Node.ELEMENT_NODE){
                continue;
            }

            System.out.println("===============");
            //вытягиваем name
            Element element = (Element) node;
            String name = element.getElementsByTagName("name").item(0).getTextContent();
            System.out.println("name = "+name);

            //вытягиваем surname
            String surname = element.getElementsByTagName("surname").item(0).getTextContent();
            System.out.println("surname = "+surname);

            String ageString = element.getElementsByTagName("age").item(0).getTextContent();
            int age  = Integer.valueOf(ageString);
            System.out.println("age = "+age);

            String idString = element.getElementsByTagName("id").item(0).getTextContent();
            int id = Integer.valueOf(idString);
            System.out.println("id = "+id);

            String isDegreeString = element.getElementsByTagName("isDegree").item(0).getTextContent();
            boolean isDegree = Boolean.valueOf(isDegreeString);
            System.out.println("isDegree = "+isDegree);

            People people = new People();
            people.setName(name);
            people.setSurname(surname);
            people.setAge(age);
            people.setDegree(isDegree);
            people.setId(id);

            peoples.add(people);


        }
        root.setPeople(peoples);
     System.out.println("++++++++++++++");
     System.out.println("root = "+ root.toString());
    }





    private static void parseJson(){

        JSONParser parser = new JSONParser() ;
        FileReader fileReader = null;

        try{

            Root rootModel = new Root();
            fileReader = new FileReader("test.json");
            JSONObject root = (JSONObject) parser.parse(fileReader);

            String name = (String) root.get("name");
            System.out.println("name = " + name);

            JSONArray peoples =(JSONArray) root.get("people");
            List<People> peopleList= new ArrayList<>();

            for(Object element: peoples){
                People peopleModel = new People();
                JSONObject people = (JSONObject) element;

                long id =(Long) people.get("id");
                long age = (Long) people.get("age");
                String nameP = (String) people.get("name");
                String surname = (String) people.get("surname");
                boolean isDegree = (Boolean) people.get("isDegree");

                peopleModel.setId((int)id);
                peopleModel.setDegree( isDegree);
                peopleModel.setAge((int)age);
                peopleModel.setName(nameP);
                peopleModel.setSurname(surname);


                peopleList.add(peopleModel);

            }

            rootModel.setPeople(peopleList);

            System.out.println(rootModel.toString());


        }catch  (Exception e){
            System.out.println("Невозможно открыть xml  "+e.toString());
            return;
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (Exception e) {
                    System.out.println("Невозможно открыть xml  " + e.toString());
                    return;
                }
            }
        }
   }




//private static void parseGson(){
//
//     try{
//         BufferedReader bufferedReader = new BufferedReader(new FileReader("test.json"));
//         Gson gson = new Gson();
//
//
//         Root root = gson.fromJson(bufferedReader,Root.class);
//         System.out.println(root.toString());
//
//
//     } catch (Exception e) {
//         System.out.println("Невозможно открыть xml  " + e.toString());
//         return;
//     }
//
//
//}



//для работы с датами
    private static void parseGson(){

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("test.json"));
            GsonBuilder builder = new GsonBuilder()
                    .registerTypeAdapter(Date.class, new DataGsonConverter());
            Gson gson = builder.create();


            Root root = gson.fromJson(bufferedReader,Root.class);
            System.out.println(root.toString());


        } catch (Exception e) {
            System.out.println("Невозможно открыть xml  " + e.toString());
            return;
        }


    }


}
