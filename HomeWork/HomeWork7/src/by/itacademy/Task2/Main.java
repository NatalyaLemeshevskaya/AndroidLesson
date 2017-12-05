package by.itacademy.Task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //чтение из файла
        try (FileReader reader = new FileReader("C:\\Users\\Nataly\\Documents\\Text.txt")){
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch (IOException e){
            System.out.println("Ошибка");
        }
         //запись в файл
        try(FileWriter writer = new FileWriter("C:\\Users\\Nataly\\Documents\\Text.txt",true)){
            String text = " ,World";
            writer.write(text);
            writer.append('\n');
            
            writer.flush();


        }

        catch (IOException e){
            System.out.println("Ошибка");
        }
    }
}
