package by.itacademy.Task4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPhoneNumber extends Assert {
    Main main;

    //before after не обязательно
    @Before
    public void before() {
        main = new Main();
    }
    @After
    public void after(){
        main = null;

    }

    @Test
    public void testPhoneNumber(){
        boolean result = Main.checkPhoneNumber("375293351612");
        assertTrue(result);

    }
    @Test
    public void testPhoneNumber1(){
        boolean result = Main.checkPhoneNumber("375333351612");
        assertTrue(result);

    }
    @Test
    public void testPhoneNumber2(){
        boolean result = Main.checkPhoneNumber("375283351612");
        assertFalse(result);

    }





}
