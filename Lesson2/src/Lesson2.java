import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.*;

public class Lesson2 {
    public static void main(String[]arg) {


        //1 задание
        int[] array = {25, 6, 13, 78, 5, 98, 4, 7, 65, 27};
        int min = array[0];
        int max = array[0];
        int Indmin=array[0];
        int Indmax=array[0];
        System.out.println("Наш массив - "+ Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
                Indmin=i;
            }
                if (max < array[i]){
                    max = array[i];
                    Indmax=i;
            }
        }
        System.out.println("min value = " + min);
        System.out.println("max value = " + max);

       for (int i = 1; i < array.length; i++) {
            array[Indmin]=0;
            array[Indmax]=99;
        }
            System.out.println("Измененный массив - "+Arrays.toString(array));



      //2 задание
        float[] array2={6.2f,5.3f,4.2f,8f,8f,4.2f,4.2f,9f,9f,6.2f};
        int kol_povt=0;
        float znach=0;

              System.out.println("Наш массив - "+Arrays.toString(array2));
        for(int i=0;i<array2.length;i++){
            kol_povt=1;

            for(int j=i+1;j<array2.length;j++){

                    if(array2[i]==array2[j] &&(i!=j)) {
                        znach=array2[i];
                    kol_povt++;
            }

       }
            if(kol_povt!=1 ){
                System.out.println("["+znach+"] - повторений "+kol_povt);
            }
            kol_povt=0;
            //break;

        }


        //3 задание

        int[] array3=new int[10];


        for (int i=0;i<array3.length;i++){
            array3[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(array3));
        int k;
        for(int i=0;i<array3.length/2;i++){

                k = array3[i];
                array3[i] = array3[array3.length-i-1];
                array3[array3.length-i-1] = k;

        }
        System.out.println(Arrays.toString(array3));

        // 4 задание
        //Random random= new Random();
        //int number= random.nextInt(1000);
        //Integer number=1258;
        //String c= number.toString();
//        int num = 1234; //Данное число
//        String number = String.valueOf(num);
//        int result[] = new int[number.length()]; //Требуемый массив
//        for (int i=0; i<number.length(); i++)
//        {
//            result[i]=Integer.valueOf(number.charAt(i)).intValue();//получаем символ из строки по его номеру
//            //и записываем его как элемент массива
//          number+=Integer.toString(result[i]);//записываем полученные символы в другую строку
//            System.out.println(result);
//    }



       // for (int i = 0; i < number.length(); i++) {
         //   result[i] = number.charAt(i);
        //}

          //  System.out.println("массивчик "+Arrays.toString(result));


        //5 задание
        //сортировка пузырьком

        int[] array4=new int[10];
        for (int i=0;i<array3.length;i++){
            array4[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(array4));

        for(int i=0;i<array4.length-1;i++){
            for(int j=i+1;j<array4.length;j++){
                if(array4[i]>array4[j]){
                    int tmp=array4[i];
                    array4[i]=array4[j];
                    array4[j]=tmp;
                }
            }

        }
        System.out.println(Arrays.toString(array4));

    }
}
