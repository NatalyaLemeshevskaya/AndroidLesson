package by.itacademy.Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static Scanner in= new Scanner(System.in);
    public static void main(String []arg){
        int[] array=new int[10];

        vvod(array);
        Sorted(array,array,array);
        evenNumbers(array);

         }

    public static void vvod(int[] Ar){
        int i=0;
        for (int element : Ar)
        {

            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            Ar[i] = in.nextInt();
            System.out.println(Ar[i] + " - ");
            i++;
        }

        Vivod(Ar);

     }

   public static void Vivod (int[]Arra ) {
       System.out.println(Arrays.toString(Arra));

   }

   public static void Sorted(int[] Ar,int[] Ar2,int[]Ar3){
        // сортировка пузырьком
       for (int i=Ar.length-1; i>=0; i--)
       {
           for (int j=0; j<i; j++)
           {
               if (Ar[j] > Ar[j+1])
               {
                   int tmp = Ar[j];
                   Ar[j] = Ar[j+1];
                   Ar[j+1] = tmp;
               }
           }
       }

       //сортировка выбором
       for (int i = 0; i < Ar2.length - 1; i++) {
              int min_i = i;
           for (int j = i + 1; j < Ar.length; j++) {
               if (Ar2[j] < Ar2[min_i]) {
                   min_i = j;
               }
           }
           int temp = Ar2[i];
           Ar2[i] = Ar2[min_i];
           Ar2[min_i] = temp;
       }


       //сортировка встравками
       int i, j, value;

       for(i = 1; i <Ar3.length; i++) {
           value = Ar3[i];
           for (j = i - 1; j >= 0 && Ar3[j] > value; j--) {
               Ar3[j + 1] = Ar3[j];
           }
           Ar3[j + 1] = value;
       }

       Vivod(Ar);
       Vivod(Ar2);
       Vivod(Ar3);
   }
   public static void evenNumbers(int[]Arr){
       for(int i=0;i< Arr.length;i++){
           if( Arr[i]%2==0 && Arr[i]!=0){
                System.out.print(Arr[i]+"|");
           }

       }

   }


}
