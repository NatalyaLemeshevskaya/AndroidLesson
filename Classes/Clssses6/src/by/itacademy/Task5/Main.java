package by.itacademy.Task5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date.toString());
        //время с января 80гг
        System.out.println(date.getTime());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy", Locale.ENGLISH);
        String dataText = simpleDateFormat.format(date);
        System.out.println(dataText);


        String unputDate = "2017-11-30 17:50";
        Date data2 = null;

        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH);
        try {
            data2 = simpleDateFormat2.parse(unputDate);
        }catch (Exception e){
            System.out.println("Неверный формат данных");
        }
        System.out.println(data2.toString());



        Date date1 = new Date();
        int day = date1.getDate();
        //' -экранирует,выводит содержимое как есть без замены на дату
        String pattern = "MMMM dd'" + getPostfix(day) + "' hh:mm a";

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(pattern,Locale.ENGLISH);
        simpleDateFormat1.setTimeZone(TimeZone.getTimeZone("GMT+0"));
        String dataText1 = simpleDateFormat1.format(date1);
        System.out.println(dataText1);


        GregorianCalendar gregorianCalendar = new GregorianCalendar();
      // как пример
        gregorianCalendar.setTime(date1);
        //получить день
        int day1 = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        //  gregorianCalendar.setTimeInMillis(5664782);
        int month = gregorianCalendar.get(GregorianCalendar.MONTH);
        //прибовляем 30 дней
        gregorianCalendar.add(GregorianCalendar.DATE,23);


        System.out.println(gregorianCalendar.getTime().toString());
        System.out.println(day1);
        System.out.println(month);



        gregorianCalendar.setTimeZone(TimeZone.getTimeZone("GMT+3"));

    }

    private static String getPostfix(int day){

        if (day>= 11 && day<= 13) return "th";

        switch (day%10){
            case 1:{
                return "st";

            }
            case 2:{
                return "nd";

            }
            case 3:{
                return "rd";

            }
            default:{
                return "th";

            }

        }

    }




}
