package by.itacademy.Task;

import java.awt.*;
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



      Scanner in = new Scanner(System.in);
      System.out.println("Нажмите 1 для поиска по имени, 2 - по возрасту,3 - по болезни");
      int a = in.nextInt();

      switch (a){

          case 1: {

              System.out.println("Введите имя пациента: ");
              String name=in.next();

              for(Pacient pacient1:pacient){
                  if(pacient1.getName().contains(name)){
                      printPeople(pacient1);
                    }
                    else{
                      System.out.println("Данного пациента нет в нашей базе ");
                      break;
                  }
              break;
              }

          }

          case 2:{
              System.out.println("Введите возраст пациента: ");
              int age=in.nextInt();
              for(Pacient pacient1:pacient){
                  if(pacient1.getAge() == age){
                      printPeople(pacient1);
                  }
                  else{
                      System.out.println("Данного пациента нет в нашей базе ");
                  }
                  break;
              }
              break;

          }
          case 3:{
              System.out.println("Введите диагноз пациента: ");
              String disease=in.next();
              for(Pacient pacient1:pacient){
                  if(pacient1.getDisease().contains(disease)){
                      printPeople(pacient1);
                  }
                  else{
                      System.out.println("Пациента с таким диагнозом нет в нашей базе ");
                  }
                  break;
              }
               break;
          }
          default:
              System.out.println("Вы ввели неправильную цифру");

      }


    }
    public static void printPeople(Pacient pacient){

        System.out.println("Пациент "+pacient.getName()+" в возрасте "+pacient.getAge()+", диагноз - "+pacient.getDisease() );

    }
}
