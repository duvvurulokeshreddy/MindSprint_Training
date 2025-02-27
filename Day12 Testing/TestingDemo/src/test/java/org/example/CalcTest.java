package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions.*;

public class CalcTest {
    private Calculator calc;
@BeforeEach
    public void setUp(){
        calc=new Calculator();
    }
@AfterEach
    public void tearDown(){
        calc=null;
    }

    @Test
    public void addTest(){
        Assertions.assertEquals(10, calc.add(4, 6));
        Assertions.assertEquals(-2, calc.add(4, -6));
        Assertions.assertEquals(0, calc.add(6, -6));
    }
    @Test
    @Disabled
    public void subTest(){
        Assertions.assertEquals(10, calc.sub(14, 6));
        Assertions.assertEquals(-2, calc.sub(8, -6));
        Assertions.assertEquals(0, calc.sub(5, -5));
    }
    @Test
    public void mulTest(){
        Assertions.assertEquals(10, calc.mul(2, 5));
    }
    @Test
    public void divTest(){
        Assertions.assertEquals(10, calc.div(50, 5));
    }

}
