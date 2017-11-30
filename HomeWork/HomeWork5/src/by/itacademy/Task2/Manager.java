package by.itacademy.Task2;

import java.util.Scanner;

public class Manager {
public static Scanner in = new Scanner(System.in);

public int a;
public int b;
public int c;
public int sot ;
public int pt;
public int dv ;


    public  int dobavl(){
        System.out.println("Введите сумму добавления денег в банкомат = ");
        int mon = in.nextInt();
        kolMoney(mon);
       // return mon;
        sot = sot + a;
        pt = pt + b;
        dv = dv + c;
        System.out.println(sot+"-сотки"+pt+"-пятидесятки"+dv+"двадцатки ");
        return mon;
    }


    public  int snyat(){
        System.out.println("Введите сумму снятия денег в банкомат = ");
        int mon = in.nextInt();
        kolMoney(mon);
        // return a;
        sot = sot - a;
        pt = pt - b;
        dv = dv - c;
        System.out.println(sot+"-сотки"+pt+"-пятидесятки"+dv+"двадцатки ");
        return mon;
    }



    public  int kolMoney(int money) {
         a = money/100;
         b = (money%100)/50;
         c = ((money%100)%50)/20;
        System.out.println("\nСотен "+a+" \nПятидесяток "+b+" \nДвадцаток "+c);
        return money;

    }
//
//    public void dobavl(){
//        sot = sot + a;
//        pt = pt + b;
//        dv = dv + c;
//        System.out.println(sot+"-сотки"+pt+"-пятидесятки"+dv+"двадцатки ");
//    }

//   public void snyat(){
//        sot = sot - a;
//        pt = pt - b;
//        dv = dv - c;
//       System.out.println(sot+"-сотки"+pt+"-пятидесятки"+dv+"двадцатки ");
//
//   }



}
