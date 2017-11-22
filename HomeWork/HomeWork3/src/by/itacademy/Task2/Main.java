package by.itacademy.Task2;

public class Main {
    public static void main(String[]arg){
       kolStr(152);

    }
    public static int kolStr(int N){
        int str= N/10;
        if(N%10!=0){
            str+=1;
        }
        System.out.println( N+ " записей помещается на " +str+" страниц");
        return N;
    }

}
