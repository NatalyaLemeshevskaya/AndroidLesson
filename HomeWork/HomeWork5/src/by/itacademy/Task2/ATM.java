package by.itacademy.Task2;

import java.util.Scanner;

public class ATM {
public static Scanner in = new Scanner(System.in);

    public int hundred1;
    public int fifties1;
    public int twenty1;
    public int hundred ;
    public int fifties;
    public int twenty ;


    public  int dobavl(){
        System.out.println("Введите сумму добавления денег в банкомат = ");
        int mon = in.nextInt();
        kolMoney(mon);
        hundred = hundred + hundred1;
        fifties = fifties + fifties1;
        twenty = twenty + twenty1;
        System.out.println(hundred+"-сотки"+fifties+"-пятидесятки"+twenty+"двадцатки ");
        return mon;
    }


    public  int snyat(){
        System.out.println("Введите сумму снятия денег с банкомата = ");
        int mon = in.nextInt();
        kolMoney(mon);
        hundred = hundred - hundred1;
        fifties = fifties - fifties1;
        twenty = twenty- twenty1;
        System.out.println(hundred+"-сотки "+fifties+"-пятидесятки "+twenty+"двадцатки ");
        return mon;
    }



    public  int kolMoney(int money) {
        hundred1 = money/100;
        fifties1 = (money%100)/50;
        twenty1 = ((money%100)%50)/20;
        System.out.println("\nСотен "+hundred1+" \nПятидесяток "+fifties1+" \nДвадцаток "+twenty1);
        return money;

    }






}
