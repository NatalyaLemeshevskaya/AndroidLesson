package by.itacademy.Task.DownLoad;

import by.itacademy.Task.entity.Root;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownLoader {

       public Root loader(String link){

        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        String fileName = "";

        try{
            URL url = new URL(link);

//Чтобы получить объект класса HttpURLConnection, следует вызвать метод openConnection()
// для объекта типа URL, но результат нужно привести к типу HttpURLConnection.
            HttpURLConnection httpURLConnection =
                    (HttpURLConnection) url.openConnection();

//Необходимо убедиться, что соединение по протоколу HTTP действительно установлено.
            int responceCode = httpURLConnection.getResponseCode();
            if(responceCode == HttpURLConnection.HTTP_OK){

                inputStream = httpURLConnection.getInputStream();


                if(link.endsWith(".xml")){
                    fileName = "goods.xml";
                }else if(link.endsWith(".json")){
                    fileName = "goods.json";
                }

                File file  = new File(fileName);
                fileOutputStream = new FileOutputStream(file);

                int byteRead =-1;
                byte[] buffer = new byte[2048];

                while ((byteRead = inputStream.read(buffer))!=-1){
                    fileOutputStream.write(buffer, 0, byteRead);
                }



            }else{
                System.out.println("Данные не найдены, responce code = "+ responceCode);
            }


        }catch (Exception e){
            System.out.println("Невозможно скачать файл, error"+e.toString());

        }finally {
            if(inputStream !=null){
                try{inputStream.close();
                }catch (IOException e){
                    System.out.println("Невозможно закрыть файл inputStream ");
                }

            }if(fileOutputStream!= null){
                try {
                    fileOutputStream.close();
                }catch (IOException e){
                    System.out.println("Невозможно закрыть файл fileOutputStream ");

                }
            }

        }


return null;

    }


}
