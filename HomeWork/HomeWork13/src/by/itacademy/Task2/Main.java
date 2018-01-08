package by.itacademy.Task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static final String TEXT = "file.xml";
    public static void main(String[] args) {


       typeOfFile(TEXT);

    }

    public static void typeOfFile(String file){

        Pattern pattern = Pattern.compile("\\u002E(xml|json)");
        Matcher matcher = pattern.matcher(file);
        while(matcher.find()) {
            System.out.print("Файл с разрешением "+ matcher.group());
        }

    }
}
