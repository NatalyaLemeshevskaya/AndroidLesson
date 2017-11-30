package by.itacademy.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sot;
        int pt;
        int dv;
        Manager manager = new Manager();
        int money = 470;
        System.out.println("Количество денег в банкомате: "+ money);
        manager.kolMoney(money);
        sot = manager.a;
        pt = manager.b;
        dv = manager.c;

        int money2 = manager.vvod() + money;
        System.out.println("Количество денег в банкомате: "+ money2);
        sot = sot +manager.a;
        pt = pt + manager.b;
        dv = dv +manager.c;
        System.out.println(sot+"-сотки"+pt+"-пятидесятки"+dv+"двадцатки ");

        int money3 = money2 - manager.vvod();
        System.out.println("Количество денег в банкомате: "+ money3);
        sot = sot - manager.a;
        pt = pt - manager.b;
        dv = dv - manager.c;
        System.out.println(sot+"-сотки"+pt+"-пятидесятки"+dv+"двадцатки ");




    }




}
