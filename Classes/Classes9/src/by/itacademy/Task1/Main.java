package by.itacademy.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//<> параметризированный класс, может содержать разное
        ArrayList<String> array = new ArrayList<>();
        array.add("1111");
        array.add("2222");
        array.add("3333");
        array.add("4444");
        System.out.println(array.size());
        array.add("5555");
        System.out.println(array.size());
        System.out.println("Значение под индексом 0 "+array.get(0));

        array.remove(2);
        System.out.println(array.size());

        array.add(3,"6666");
        System.out.println(array);

        //заменяет значение под индексом на
        array.set(3,"7777");
        System.out.println(array);



        for(String text: array){

          //осторожно с for елси удалять эллемент

        }
        //двухсвязный список, каждый эл-т имеет ссылку на предыдущий и следующий

        List<Student> studentList = new LinkedList<>();




//        Scanner in = new Scanner(System.in);
//
//
//   // while (true) {
//
//    System.out.println("Введите 1 если хотите довабить студента ");
//    int a = in.nextInt();
//
//    if (a == 1) {
//
//        System.out.println("Введите имя студента");
//        String name = in.next();
//        System.out.println("Введите возраст студента");
//        int age = in.nextInt();
//
//        Student student = new Student(name, age);
//        studentList.add(student);
//
//    }
//  // break;
////}
//
//
//
//for (Student student: studentList)
//         System.out.println(student.getAge());
//       // System.out.println(student.getName());
//        System.out.println(studentList.toString());




        Student student1 = new Student("Name",25);
        Student student2 = new Student("Name",25);

        Collections.sort(array);
        System.out.println(array);

        Collections.sort(studentList);

        Collections.sort(studentList, new SortByAge());






    }
}
