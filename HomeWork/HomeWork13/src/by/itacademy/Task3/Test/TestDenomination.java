package by.itacademy.Task3.Test;

import by.itacademy.Task3.ATM;
import org.junit.Assert;
import org.junit.Test;

public class TestDenomination extends Assert {
    ATM atm = new ATM();



    @Test
    public void denomination1(){

        atm.amountOfMoneyInDenom(120);
        boolean twenty = atm.twentyNew == 1;
        boolean fifties = atm.fiftiesNew == 0;
        boolean hundred = atm.hundredNew ==1;

        assertTrue(hundred);
        assertTrue(fifties);
        assertTrue(twenty);
    }
    @Test
    public void denomination2(){

        atm.amountOfMoneyInDenom(150);
        boolean twenty = atm.twentyNew == 1;

        assertFalse(twenty);
    }

    @Test
    public void denomination3(){

        atm.amountOfMoneyInDenom(140);
        boolean fifties = atm.fiftiesNew == 2;

        assertFalse(fifties);
    }
}
