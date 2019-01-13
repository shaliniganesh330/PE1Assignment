package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenCheckTest {
    OddEvenCheck oddorevennumobject;
    @Before
    public void setUp() throws Exception {
    oddorevennumobject = new OddEvenCheck();
    }

    @After
    public void tearDown() throws Exception {
        oddorevennumobject = null;
    }

    @Test
    public void TestOddOrEven() throws Exception{
        int num = 22;
        String expectedValue_1 = "Jerry";
        String actualValue_1 = oddorevennumobject.oddEven(num);
        assertEquals(expectedValue_1,actualValue_1);
    }
    @Test
    public void testOddOrEvenSuccess() throws Exception {
        int num2 = 18;
        String expectedValue= "Invalid input";
        String actualValue = oddorevennumobject.oddEven(num2);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testOddOrEvenTestSuccess() throws Exception {
        int num3 = 27;
        String expectedValue = "Tom";
        String actualValue = oddorevennumobject.oddEven(num3);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void testOddOrEvenTestFialure() throws Exception {
        int num3 = 27;
        String expectedValue = "Jerry";
        String actualValue = oddorevennumobject.oddEven(num3);
        assertNotEquals(expectedValue,actualValue);
    }
}