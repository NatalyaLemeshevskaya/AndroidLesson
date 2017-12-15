package by.itacademy.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> student = new ArrayList<>();
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

        Set<String> newStudent = new HashSet<>();
        newStudent.addAll(student);

        System.out.println("Список студентов без дубликатов : ");
        for(String student1 : newStudent){
            System.out.println(student1);
       }



    }
}


