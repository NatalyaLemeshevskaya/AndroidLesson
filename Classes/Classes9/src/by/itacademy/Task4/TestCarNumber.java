package by.itacademy.Task4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCarNumber extends Assert{

    Main main;
    @Before
    public void before() {
        main = new Main();
    }
    @After
    public void after(){
        main = null;

    }

    @Test
    public void testCarNumber(){
        boolean result = Main.checkCarNumber("2050 MP-7");
        assertTrue(result);

    }

    @Test
    public void testCarNumber2(){
        boolean result = Main.checkCarNumber("2050 AC-1");
        assertTrue(result);

    }

    @Test
    public void testCarNumber3(){
        boolean result = Main.checkCarNumber("20505 MP-7");
        assertFalse(result);

    }
    @Test
    public void testCarNumber4(){
        boolean result = Main.checkCarNumber("20505 MP-10");
        assertFalse(result);

    }

}
