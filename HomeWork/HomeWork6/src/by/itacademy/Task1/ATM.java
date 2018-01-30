package by.itacademy.Task1;

import java.util.Scanner;

public class ATM extends Action implements ATMMoney,ATMVivod,ATMVvod,Bank {
    Scanner in = new Scanner(System.in);

    public int countHundred;
    public int countFifties;
    public int countTwenty;
    public int hundred ;
    public int fifties;
    public int twenty ;



    @Override
    public int amountOfMoneyInDenom(int money) {
        countHundred = money/100;
        countFifties = (money%100)/50;
        countTwenty = ((money%100)%50)/20;
        System.out.println("Сотен - "+ countHundred +" Пятидесяток - "+ countFifties +" Двадцаток - "+ countTwenty);
        return money;
    }

    @Override
    public int vivod() {
        System.out.println("Введите сумму снятия денег с банкомата = ");
        int mon = in.nextInt();
        amountOfMoneyInDenom(mon);
        hundred = hundred - countHundred;
        fifties = fifties - countFifties;
        twenty = twenty - countTwenty;
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
        amountOfMoneyInDenom(mon);
        hundred = hundred + countHundred;
        fifties = fifties + countFifties;
        twenty = twenty + countTwenty;
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
