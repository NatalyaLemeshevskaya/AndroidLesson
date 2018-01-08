package by.itacademy.Task3.Test;

import by.itacademy.Task3.ATM;
import by.itacademy.Task3.Main;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLanguage extends Assert{


    ATM atm;
    @Before
    public void before(){
         atm = new ATM();
    }
    @After
    public void after(){
        atm = null;
    }

    @Test
    public void language1(){

        assertFalse(atm.language("25"));
    }

    @Test
    public void language2(){

        assertTrue(atm.language("English"));
    }

    @Test
    public void language3(){

        assertTrue(atm.language("Русский"));
    }

    @Test
    public void language4(){

        assertFalse(atm.language("русский"));
    }
    @Test
    public void language5(){

        assertFalse(atm.language("Болгарский"));
    }
}
