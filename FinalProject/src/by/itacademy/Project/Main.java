package by.itacademy.Project;

import by.itacademy.Project.entity.Goods;
import by.itacademy.Project.entity.Root;

public class Main {
    public static void main(String[] args) {

//        Parser parser = new JSONParser();
//        Root root = parser.parse("goods.json");

        Parser parser = new XMLParser();
        Root root = parser.parse("goods.xml");


    }
}
