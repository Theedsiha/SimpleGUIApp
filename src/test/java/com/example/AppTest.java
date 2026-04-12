package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(5, 5));
    }
}