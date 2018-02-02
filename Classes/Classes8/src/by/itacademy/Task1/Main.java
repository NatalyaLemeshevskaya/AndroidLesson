package by.itacademy.Task1;

import java.io.FileOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
try{
    //блок кода в котором может быть ошибка
        int a = 5/0;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("");
    Date date =  simpleDateFormat.parse("fgdf00");

//    FileOutputStream o = new FileOutputStream(new File(""));
//    o.write("fdf");

         }
//        catch (ArithmeticException e){
//    //блок когда который выполнится если в блоке try произошла ошибка
//            System.out.println("Ошибка");
//        }
//        catch (ParseException e){
//            System.out.println("Проблемы с датой ");
//        }
        //для всех ошибок
        catch (Exception e){
            System.out.println("Ошибочка "+e.toString());
        }
        finally {
            System.out.println("Выолниться всегда");
            //закрыть файл к примеру,то что всегда нужно выполнить
            // if(o != 0)
            //o.close();

        }
        try {
            double rezult = test(5, 0);
        }catch (FiveException e){
            System.out.println("Вводить 5 нельзя");
        }

    }


    public static int test(int a,int b) throws//заставляет обработать ошибку где вызывают метод
            FiveException {
        if (b==5){
            throw new FiveException();
        }

        return a/b;

    }
}
