package by.itacademy.Task1;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] arg) {

        Pacient[] pacient = new Pacient[2];

        for (int i = 0; i < pacient.length; i++) {
            pacient[i] = new Pacient();


            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy", Locale.ENGLISH);


            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя пациента № " + (i + 1) + ":");
            pacient[i].setName(in.next());
            System.out.println("Введите диагноз пациента № " + (i + 1) + ":");
            pacient[i].setDisease(in.next());
            System.out.println("Введите возраст пациента № " + (i + 1) + ":");
            pacient[i].setAge(in.nextInt());
            System.out.println("Введите дату рождения пациента № " + (i + 1) + ":");

            try {
                pacient[i].setDateOfBirsday(simpleDateFormat.parse(in.next()));
            } catch (Exception e) {
                System.out.println("Ошибка");
            }


        }
        for (Pacient i : pacient) {
            printPeople(i);
        }



        for( Pacient i: pacient) {
          srednVosrast(pacient);
          break;

        }

   }
    public static void srednVosrast(Pacient[] pacient) {

        long sum = 0;
        for( Pacient i: pacient){

            Date date = new Date();
            long age = date.getTime() - i.getDateOfBirsday().getTime();

            for( Pacient pacient1: pacient){
                sum = sum + age;
                break;
            }

        }
        System.out.println("Суммарный возраст в миллисекундах "+sum);
        long mid = sum/pacient.length;
        System.out.println("Средний возраст в миллисекундах "+mid);

        long year = mid/(31536000000L);//Информация из интернета
        long month = (mid%(31536000000L))/(2592000000L);

        System.out.println("Средний возраст пациентов примерно: лет - "+year+" месяцев - "+month);

    }


    public static void printPeople(Pacient pacient) {

        System.out.println("Пациент " + pacient.getName() + " в возрасте " + pacient.getAge() + ", диагноз - " + pacient.getDisease() + ", др " + pacient.getDateOfBirsday());

    }



}

