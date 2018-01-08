package by.itacademy.Task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ATM extends Action implements ATMMoney,ATMVivod,ATMVvod,Bank {

    Scanner in = new Scanner(System.in);

    public int hundredNew;
    public int fiftiesNew;
    public int twentyNew;
    public int hundred ;
    public int fifties;
    public int twenty ;



    @Override
    public int amountOfMoneyInDenom(int money) {

        hundredNew = money/100;
        fiftiesNew = (money%100)/50;
        twentyNew = ((money%100)%50)/20;

        System.out.println("Сотен - "+ hundredNew +" Пятидесяток - "+ fiftiesNew +" Двадцаток - "+ twentyNew);
        return money;
    }

    @Override
    public int vivod() {

        System.out.println("Введите сумму снятия денег с банкомата = ");
        int mon = in.nextInt();
        amountOfMoneyInDenom(mon);
        hundred = hundred - hundredNew;
        fifties = fifties - fiftiesNew;
        twenty = twenty- twentyNew;
        System.out.println("В банкомате: Соток - "+hundred+" Пятидесяток - "+fifties+" Двадцаток - "+twenty);
        return mon;

    }

    @Override
    public boolean language(String language) {
      //  System.out.println("Введите язык работы с банкоматом: ");
      //  String language = in.next();
        System.out.println("Язык работы : "+language);
        Pattern pattern = Pattern.compile("(Русский|English|Deutsch)");
        Matcher matcher = pattern.matcher(language);
        return matcher.matches();

    }

    @Override
    public int vvod() {
        System.out.println("Введите сумму добавления денег в банкомат = ");
        int mon = in.nextInt();
        amountOfMoneyInDenom(mon);
        hundred = hundred + hundredNew;
        fifties = fifties + fiftiesNew;
        twenty = twenty + twentyNew;
        System.out.println("В банкомате: Соток - "+hundred+" Пятидесяток - "+fifties+" Двадцаток - "+twenty);
        return mon;
    }

    @Override
    public void amountOfMoney(int money) {
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
