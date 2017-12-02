package by.itacademy.Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] Array1 = new int[10];
        int[] Array2 = new int[20];
        createArray(Array1);
        createArray(Array2);
        arrayCopy(Array1,Array2);

    }
    public static void arrayCopy (int[] array1, int[] array2){
        int[] array3 = new int[30];
        System.arraycopy(array1,0,array2,array2.length/4,array1.length);
                    System.out.println(Arrays.toString(array2));

           }

    public static  void createArray(int array[]) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
            System.out.println(Arrays.toString(array));

        }
    }