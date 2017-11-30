package by.itacademy.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();
        int money = 470;
        System.out.println("Количество денег в банкомате: "+ money);
        manager.kolMoney(money);
        manager.sot = manager.a;
        manager.pt = manager.b;
        manager.dv= manager.c;

        int money2 = manager.dobavl() + money;
        System.out.println("Количество денег в банкомате: "+ money2);


        int money3 = money2 - manager.snyat();
        System.out.println("Количество денег в банкомате: "+ money3);

    }




}
