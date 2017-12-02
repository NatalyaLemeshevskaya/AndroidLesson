package by.itacademy.Task1;

public class Main {
    public static void main(String[] args) {
    ATM atm = new ATM();
    atm.language();
    atm.setNameOfBank();
    atm.setNameOfProducer();
    int money = 470;

        atm.kolMoney(money);
        atm.kolMoney1(money);

        atm.hundred = atm.hundred1;
        atm.fifties = atm.fifties1;
        atm.twenty= atm.twenty1;

        int money2 = atm.vvod() + money;
        atm.kolMoney(money2);

        int money3 = money2 - atm.vivod();
        atm.kolMoney(money3);

    }
}
