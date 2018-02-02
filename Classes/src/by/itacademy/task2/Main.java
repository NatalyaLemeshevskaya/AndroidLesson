package by.itacademy.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){

        //Swing- к итоговому проекту, про интервейс
       // ввод с консоли
     //   int a = 0;
      //  int b = 0;

       // Scanner scanner = new Scanner(System.in);
      //  System.out.println("Введите а");
      //  a = scanner.nextInt();
      //  System.out.println("Введите b");
       // b = scanner.nextInt();
       // System.out.println(a + b);

        String[] array= new String[10];
        array[0] = "sgdh";
        array[1] = "djfhsldjfls";


       int a = 5;
       int b = 10;
       System.out.println("до вызова");
        test(a,b,"dflksjdfhfkl");
        System.out.println("после вызова");

        System.out.println("завершение приложения");

        printArray(array);

        int rezult = 0;
        rezult=plus(10,15);
        System.out.println(rezult);



    }
    public static void test(int value,int value2, String text){
        System.out.println("Test "+ value);
        System.out.println("Test "+ value2);
        System.out.println("Test "+ text);
        hello();

    }
    public static void hello(){
        System.out.println("Hello");
    }
    public static void printArray(String[] array){

        System.out.println("test"+ Arrays.toString(array));
    }
//сигнатура метода(уникальность метода)
    public static int plus(int a,int b){
        int sum = a + b;
        //возвращаем метод
        return sum;

    }
// можно одинаковое название
  //  public static void plus(){
    //    // если правда, не делает ничего после ретурн
      //  if(true){
        //    return
        //}

  // }





}
