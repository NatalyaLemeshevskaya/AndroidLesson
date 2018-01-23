package by.itacademy.Project.data;

import by.itacademy.Project.data.entity.Root;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownLoader {

       public boolean loader(String link){
           boolean isOk = false;

        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        String fileName = "";

        try{
            URL url = new URL(link);

            /**
             * Чтобы получить объект класса HttpURLConnection, следует вызвать метод openConnection()
             * для объекта типа URL, но результат нужно привести к типу HttpURLConnection.
             */
             HttpURLConnection httpURLConnection =
                    (HttpURLConnection) url.openConnection();


            // Необходимо убедиться что соединение действительно установлено

            int responseCode = httpURLConnection.getResponseCode();
            //Если установлено
            if(responseCode == HttpURLConnection.HTTP_OK){

                inputStream = httpURLConnection.getInputStream();

                /**
                 * Проверяем на что заканчивается ссылка и тем самым узнаем
                 * куда записывать информацию из файла
                 */
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

                if(file.canRead()){
                    isOk = true;
                }

            }else{
                System.out.println("Данные не найдены, responce code = "+ responseCode);
            }


        }catch (Exception e){
            System.out.println("Невозможно скачать файл, error"+e.toString());

        }finally {
            //Проверяем были бы открыты потоки, если да - закрываем
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


      return isOk;

    }


}
