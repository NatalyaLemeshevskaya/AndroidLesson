package by.itacademy.Task1;

import java.util.Scanner;

public class ATM extends Action implements ATMMoney,ATMVivod,ATMVvod,Bank {
    Scanner in = new Scanner(System.in);

    public int hundred1;
    public int fifties1;
    public int twenty1;
    public int hundred ;
    public int fifties;
    public int twenty ;



    @Override
    public int kolMoney1(int money) {
        hundred1 = money/100;
        fifties1 = (money%100)/50;
        twenty1 = ((money%100)%50)/20;
        System.out.println("Сотен - "+hundred1+" Пятидесяток - "+fifties1+" Двадцаток - "+twenty1);
        return money;
    }

    @Override
    public int vivod() {
        System.out.println("Введите сумму снятия денег с банкомата = ");
        int mon = in.nextInt();
        kolMoney1(mon);
        hundred = hundred - hundred1;
        fifties = fifties - fifties1;
        twenty = twenty- twenty1;
        System.out.println("В банкомате: Соток - "+hundred+" Пятидесяток - "+fifties+" Двадцаток - "+twenty);
        return mon;

    }

    @Override
    public void language() {
        System.out.println("Введите язык работы с банкоматом: ");
        String language = in.next();
        System.out.println("Вы выбрали "+language+" язык");


    }

    @Override
    public int vvod() {
        System.out.println("Введите сумму добавления денег в банкомат = ");
        int mon = in.nextInt();
        kolMoney1(mon);
        hundred = hundred + hundred1;
        fifties = fifties + fifties1;
        twenty = twenty + twenty1;
        System.out.println("В банкомате: Соток - "+hundred+" Пятидесяток - "+fifties+" Двадцаток - "+twenty);
        return mon;
    }

    @Override
    public void kolMoney(int money) {
        System.out.println(" Количество денег в банкомате: "+money );

    }

    @Override
    public void setNameOfProducer() {
        System.out.println("Производство банкомата - Россия");
    }

    @Override
    public void setNameOfBank() {
        System.out.println("Банк Мосвка-Минск");

    }
}
