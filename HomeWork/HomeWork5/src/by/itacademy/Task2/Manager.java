package by.itacademy.Task2;

import java.util.Scanner;

public class Manager {
public static Scanner in = new Scanner(System.in);

public int a;
public int b;
public int c;


    public  int vvod(){
        System.out.println("Введите сумму добавления денег в банкомат = ");
        int a = in.nextInt();
        kolMoney(a);
        return a;
    }


    public  int kolMoney(int money) {
         a = money/100;
         b = (money%100)/50;
         c = ((money%100)%50)/20;
        System.out.println("\nСотен "+a+" \nПятидесяток "+b+" \nДвадцаток "+c);
        return money;

    }





}
