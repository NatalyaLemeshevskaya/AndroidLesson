package by.itacademy.Task1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> student = new LinkedList<>();
        Scanner in = new Scanner(System.in);

        String str = "end";

        while (true) {
            System.out.println("Введите имя студента или end для окончания списка ");
            String name = in.nextLine();
            if (name.equals(str))
                break;
            student.add(name);
        }
        System.out.println("Список студентов: ");

        for (int i = 0; i < student.size(); i++){

            System.out.println(student.get(i));
    }

    System.out.println("Список студентов без буквы а");
        for (int i = 0; i < student.size(); i++){
            String newstr = student.get(i).replaceAll("а","");
            System.out.println(newstr);
        }


    }
}


