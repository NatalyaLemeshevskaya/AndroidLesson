package by.itacademy.Task4;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[]arg){

        Pacient[] pacient = new Pacient[2];

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

//     String pathToFile = "C://MyFile.txt//MyFile";
//     File file = new File(pathToFile);

        String path = new File("").getAbsolutePath();
        File newFile = new File(path + "file1.txt");

        try
        {
            boolean created = newFile.createNewFile();
            if(created)
                System.out.println("Файл создан");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        for( Pacient i: pacient) {
            String text = printPeople(i);


            try (FileOutputStream fos = new FileOutputStream(newFile)) {
                // перевод строки в байты
                byte[] buffer = text.getBytes();

                fos.write(buffer, 0, buffer.length);
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }

        }


//        try
//     {
//         FileWriter fr =  new FileWriter(newFile);
//         for( int i = 0;i<pacient.length;i++){
//             fr.write(i);
//         }
//         fr.close();
//
//         }catch (IOException e){
//         System.out.println(e.getMessage());
//     }


    }
    public static String  printPeople(Pacient pacient){

        String text = "Пациент "+pacient.getName()+" в возрасте "+pacient.getAge()+", диагноз - "+pacient.getDisease();
        System.out.println(text );
        return text;

    }
}
