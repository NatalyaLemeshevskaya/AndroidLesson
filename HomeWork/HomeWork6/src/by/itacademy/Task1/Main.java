package by.itacademy.Task1;

public class Main {
    public static void main(String[] args) {
    ATM atm = new ATM();
    atm.language();
    atm.setNameOfBank();
    atm.setNameOfProducer();
    int money = 470;

        atm.kolMoney(money);
        atm.amountOfMoneyInDenom(money);

        atm.hundred = atm.countHundred;
        atm.fifties = atm.countFifties;
        atm.twenty = atm.countTwenty;

        int money2 = atm.vvod() + money;
        atm.kolMoney(money2);

        int money3 = money2 - atm.vivod();
        atm.kolMoney(money3);

    }
}
