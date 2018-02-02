package by.itacademy.TaskSobes;


//задача из собеседования
public class Main {
    public static void main(String[] args) {

        int a=0;
        int[] array = {1,2,5,1,5};
        for(int i =0;i<array.length;i++) {
            //XOR плюсует все значания в двоичном,соответсвенно остается один
            a =  a ^array[i];
            }
        System.out.println(a);


    }
}
