package com.elcho.maven.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculationTests {

    @Test
    public void testAdd(){

        Calculation cal = new Calculation();
        int c = cal.add(5, 5);
        System.out.print("---------5 + 5  = " + c);

    }

    @Test
    public void testSub(){

        Calculation cal = new Calculation();
        int c = cal.sub(14, 5);
        System.out.print("---------14 - 5  = " + c);
    }
}
