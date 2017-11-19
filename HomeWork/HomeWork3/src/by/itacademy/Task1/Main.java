package by.itacademy.Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static Scanner in= new Scanner(System.in);
    public static void main(String []arg){
        int k=array(10);


    }

    public static int array(int num){
        int [] array= new int[num];
        int i=0;
        for (int element : array)
        {

            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            array[i] = in.nextInt();
            System.out.println(array[i] + " - ");
            i++;
        }
        for(i=0;i<array.length;i++){
            System.out.println(Arrays.toString(array));
            break;}



         return array;

     //   for (int element : array)

            //System.out.print(element + " ");



   }

}
