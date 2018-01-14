package by.itacademy.Project;

import by.itacademy.Project.entity.DateJsonConverter;
import by.itacademy.Project.entity.Goods;
import by.itacademy.Project.entity.Root;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;

public class JSONParser implements Parser {


    @Override
    public Root parse(String file) {

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
