package by.itacademy.Task3;

public class Main {
    public static void main(String[] args) {
    ATM atm = new ATM();

    atm.language("Русский");
    atm.setNameOfBank();
    atm.setNameOfProducer();

    int money = 470;

        atm.amountOfMoney(money);
        atm.amountOfMoneyInDenom(money);

        atm.hundred = atm.hundredNew;
        atm.fifties = atm.fiftiesNew;
        atm.twenty= atm.twentyNew;

        int money2 = atm.vvod() + money;
        atm.amountOfMoney(money2);

        int money3 = money2 - atm.vivod();
        atm.amountOfMoney(money3);

    }
}
