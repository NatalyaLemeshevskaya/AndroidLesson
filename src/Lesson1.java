import java.util.Scanner;

import static java.lang.Math.*;
public class Lesson1 {

    public static void main(String[] arg){
        //1 задание
        String str="Really long sentence";
        int dlina = str.length();
        System.out.println("Количество символов="+dlina);
        String str1 = str.substring(0,10);
        String str2 = str.substring(10);
        System.out.println("Первая строка="+str1);
        System.out.println("Вторая строка="+str2);

        //2 задание
        int number = 87;
        int lastNumb = number%10;

            if (lastNumb == 7)
            {
                System.out.println("Число заканчивается на 7");
            }
        else{
            System.out.println("Число не заканчивается на 7");
        }

        //3 задание
        int a=2;
        int b=3;
        double r=2.0;
        double diagonal;
        diagonal= sqrt(pow(a,2)+pow(b,2));
        if (r >= (diagonal/2)){
            System.out.println("Картонка полностью закроет отверстие");
        }
        else {
            System.out.println("Картонка не сможет закрыть отверстие");
        }

        //4 задание
        int summa = 23;

            switch (summa % 10) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println(summa + " рублей");
                    break;

                case 1:
                    System.out.println(summa + " рубль");
                    break;

                case 2:
                case 3:
                case 4:
                    System.out.println(summa + " рубля");
                    break;


            }


         // 5 задание
         String stroka = "-Say me ?###-Ok,?";
            String stroka2= stroka.replace("?","Hello");
            String stroka3= stroka2.replace("#","");
            System.out.println(stroka3);

         //6 задание
        Scanner in= new Scanner(System.in);
        System.out.println("Введите x ");
        int x= in.nextInt();
        // или заменить последние 3 строки на int x=6;
        int t=2;
        int s=3;
        double one= pow(x,t);
        double two= pow(sin(one),2);
        double three= sqrt((1+pow(x,s)));
        double y= two/three;
        System.out.println(y);












    }
}
