package by.itacademy.Task2;

import by.itacademy.Task1.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Set<String> testSet = new HashSet<>();
//        testSet.add("aaa");
//        testSet.add("bbb");
//        testSet.add("aaa");
//
//        for(String test: testSet){
//            System.out.println("Value = "+test);
//        }
//
//
//        List<String> list = new ArrayList<>();
//
//        list.add("aaa");
//        list.add("bbb");
//        list.add("aaa");
//        // перекинули в HashSet
//        testSet.addAll(list);
//
//        list.clear();
//        list.addAll(testSet);


        Set<Student> testSet = new HashSet<>();

        testSet.add(new Student("aaa",25));
        testSet.add(new Student("bbb",35));
        testSet.add(new Student("aaa",25));

        for (Student student: testSet){
            System.out.println(student.getName());
        }

        Map<String,String> testMap= new HashMap<>();
        testMap.put("Ru","ru value");
        testMap.put("By","by value2");
        testMap.put("En","value");
        testMap.put("Fr","value");
        testMap.put("In","value");

        System.out.println("value = "+testMap.get("Ru"));







    }


}
