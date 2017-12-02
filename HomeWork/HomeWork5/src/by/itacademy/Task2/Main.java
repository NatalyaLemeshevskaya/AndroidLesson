package by.itacademy.Task2;

public class Main {
    public static void main(String[] args) {

        ATM atm = new ATM();
        int money = 470;
        System.out.println("Количество денег в банкомате: "+ money);
        atm.kolMoney(money);
        atm.hundred = atm.hundred1;
        atm.fifties = atm.fifties1;
        atm.twenty= atm.twenty1;

        int money2 = atm.dobavl() + money;
        System.out.println("Количество денег в банкомате: "+ money2);


        int money3 = money2 - atm.snyat();
        System.out.println("Количество денег в банкомате: "+ money3);

    }




}
