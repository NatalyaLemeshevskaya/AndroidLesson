package by.itacademy.Task;

import by.itacademy.Task.Entity.Root;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {
    private static final String Link = "http://kiparo.ru/t/shop.json";
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

                File file  = new File("shop.json");
                fileOutputStream = new FileOutputStream(file);

                int byteRead =-1;
                byte[] buffer = new byte[2048];

                while ((byteRead = inputStream.read(buffer))!=-1){
                    fileOutputStream.write(buffer, 0, byteRead);
                }

               parseJackson();


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

    public static  void parseJackson()  {


        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(
                DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            File json = new File("shop.json");
            final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            objectMapper.setDateFormat(df);
            Root root =  objectMapper.readValue(json, Root.class);
            System.out.println("Java object created from JSON String :");
            System.out.println(root);


        } catch (JsonGenerationException ex) {
            System.out.println(ex.getMessage());
        } catch (JsonMappingException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage()); }


    }



}
