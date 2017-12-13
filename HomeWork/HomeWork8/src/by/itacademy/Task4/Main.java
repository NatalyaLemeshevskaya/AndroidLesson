package by.itacademy.Task4;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[]arg) throws Exception{

        Pacient[] pacient = new Pacient[2];

        String path = new File("").getAbsolutePath();
        File newFile = new File(path + "file1.txt");

//проверяем существует ли файл

        if(!newFile.exists()) {
            try
            {
                //создаем файл

                boolean created = newFile.createNewFile();
                if(created)
                    System.out.println("Файл создан");
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
//заполняем созданный файл

            for(int i=0;i<pacient.length;i++) {
                pacient[i] = new Pacient();

                Scanner in = new Scanner(System.in);
                System.out.println("Введите имя пациента № "+(i+1)+":");
                pacient[i].setName(in.next());
                System.out.println("Введите диагноз пациента № "+(i+1)+":");
                pacient[i].setDisease(in.next());
                System.out.println("Введите возраст пациента № "+(i+1)+":");
                pacient[i].setAge(in.nextInt());


            }
            for( Pacient i: pacient){
                printPeople(i);
            }

            try (PrintWriter printWriter = new PrintWriter(newFile,"UTF-8")) {
                for (int i = 0; i < pacient.length; i++) {
                    printWriter.println(pacient[i].getName()+" "+pacient[i].getDisease()+" "+pacient[i].getAge());

                }
                printWriter.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Ошибка ");
            }

        } else {

//Считываем с файла и заполняем массив

            Scanner scanner = new Scanner(newFile);
            for (int i = 0; i < pacient.length; i++) {

                pacient[i] = new Pacient();
                pacient[i].setName(scanner.next());
                pacient[i].setDisease(scanner.next());
                pacient[i].setAge(scanner.nextInt());

            }

            for (Pacient i : pacient) {
                printPeople(i);
            }

        }


    }
    public static String  printPeople(Pacient pacient){

        String text = "Пациент "+pacient.getName()+" в возрасте "+pacient.getAge()+", диагноз - "+pacient.getDisease();
        System.out.println(text );
        return text;

    }
}
