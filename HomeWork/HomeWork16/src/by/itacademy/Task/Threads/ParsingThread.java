package by.itacademy.Task.Threads;

import by.itacademy.Task.Main;
import by.itacademy.Task.Parse.JSONParser;
import by.itacademy.Task.Parse.Parser;
import by.itacademy.Task.Parse.XMLParser;

import static by.itacademy.Task.Main.object;

public class ParsingThread extends Thread {

    Parser parser;
    private String fileNameForXML = "goods.xml";
    private String fileNameForJSON = "goods.json";


    @Override
    public void run() {

        System.out.println("Start Parse");



            try {
                synchronized (object) {
                object.wait();
            }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Parsing XML...");
            parser = new XMLParser();
            parser.parse(fileNameForXML);
            synchronized (object) {
            object.notify();
        }

            try {
                synchronized (object) {
                    object.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Parsing JSON...");
            parser = new JSONParser();
            parser.parse(fileNameForJSON);


        System.out.println("End Parse");


    }
}
