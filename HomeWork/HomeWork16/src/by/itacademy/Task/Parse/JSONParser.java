package by.itacademy.Task.Parse;

import by.itacademy.Task.entity.DateJsonConverter;
import by.itacademy.Task.entity.Root;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;

public class JSONParser implements Parser {

//    private static final String Link = "http://kiparo.ru/t/shop.json";
//    DownLoader downLoader = new DownLoader();

    @Override
    public Root parse(String file) {

       // downLoader.Loader(Link,file);
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            GsonBuilder builder = new GsonBuilder()
                    .registerTypeAdapter(Date.class, new DateJsonConverter());
            Gson gson = builder.create();

            Root root = gson.fromJson(bufferedReader,Root.class);
            System.out.println(root.toString());


        } catch (Exception e) {
            System.out.println("Невозможно открыть xml  " + e.toString());

        }

        return null;
    }



}
