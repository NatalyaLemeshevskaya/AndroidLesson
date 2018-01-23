package by.itacademy.Project.data;

import by.itacademy.Project.data.entity.Root;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;
/**
 * Класс осуществляет парсер JSON файла
 * Переопределяет метод интерфейса Parser
 */
public class JSONParser implements Parser {


    @Override
    public Root parse(String file) {

        Root root = new Root();

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            GsonBuilder builder = new GsonBuilder()
                    .registerTypeAdapter(Date.class, new DateJsonConverter());
            Gson gson = builder.create();

            root = gson.fromJson(bufferedReader,Root.class);
            System.out.println(root.toString());


        } catch (Exception e) {
            System.out.println("Невозможно открыть json  " + e.toString());

        }

       return root;
    }



}
