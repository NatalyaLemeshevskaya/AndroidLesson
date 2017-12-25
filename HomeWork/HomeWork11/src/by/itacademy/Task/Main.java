package by.itacademy.Task;

import by.itacademy.Task.Entity.Handler;
import by.itacademy.Task.Entity.People;
import by.itacademy.Task.Entity.Root;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String Link = "http://kiparo.ru/t/test.xml";
    public static void main(String[] args) {

            InputStream inputStream = null;
            FileOutputStream fileOutputStream = null;

            try{
                URL url = new URL(Link);

                HttpURLConnection httpURLConnection =
                        (HttpURLConnection) url.openConnection();


                int responceCode = httpURLConnection.getResponseCode();
                if(responceCode == HttpURLConnection.HTTP_OK){
                    inputStream = httpURLConnection.getInputStream();

                    File file  = new File("test.xml");
                    fileOutputStream = new FileOutputStream(file);

                    int byteRead =-1;
                    byte[] buffer = new byte[2048];

                    while ((byteRead = inputStream.read(buffer))!=-1){
                        fileOutputStream.write(buffer, 0, byteRead);
                    }


                  parseSax();



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

        public static void parseSax()  {


            Handler handler = new Handler();
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = null;
            try {
                saxParser = saxParserFactory.newSAXParser();
                saxParser.parse(new File("test.xml"), handler);

            } catch (ParserConfigurationException |SAXException |IOException e) {
                System.out.println("Error" +e.getMessage());
            }


        }




}
