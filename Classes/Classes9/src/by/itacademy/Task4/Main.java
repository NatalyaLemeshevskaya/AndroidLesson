package by.itacademy.Task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

       String text = "@abc@gmail.com@";
       text = text.replaceAll("^@|@$","");
       System.out.println(text);


//       String number  = "2020 MP-7";
//       Pattern pattern = Pattern.compile("^[0-9]{4} [A-Za-z]{2}-[1-7]{1}$");
//
//        Matcher matcher = pattern.matcher(number);
//
//        if(matcher.matches()){
//            System.out.println("Номер корректный");
//        }else{
//            System.out.println("Номер некорректный");
//
//        }
//
//
//        String phoneNumber  = "375 (29) 3351612";
//        //удаляем все кроме цифр
//        phoneNumber =  phoneNumber.replaceAll("\\D","");
//        System.out.println(phoneNumber);
//
//        Pattern pattern1 = Pattern.compile("^375(29|17|33|25|44)[0-9]{7}$");
//        Matcher matcher1 = pattern1.matcher(phoneNumber);
//
//        if(matcher1.matches()){
//            System.out.println("Номер корректный");
//        }else{
//            System.out.println("Номер некорректный");
//
//        }




    }



    public static boolean checkCarNumber(String carNumber){
        Pattern pattern = Pattern.compile("^[0-9]{4} [A-Za-z]{2}-[1-7]{1}$");
        Matcher matcher = pattern.matcher(carNumber);
        return matcher.matches();
    }

    public static boolean checkPhoneNumber(String phoneNumber){
        Pattern pattern = Pattern.compile("^375(29|17|33|25|44)[0-9]{7}$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
