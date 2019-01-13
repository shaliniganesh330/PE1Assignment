package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumofIntegersTest {
    SumOfIntegers sumOfIntergesobject;
    @Before
    public void setUp() throws Exception {
        sumOfIntergesobject = new SumOfIntegers();
    }

    @After
    public void tearDown() throws Exception {
        sumOfIntergesobject =null;
    }

    @Test
    public void testSumOfIntergersTestSuccess() {
        String string ="1 1 1 1 1 1 1 1";
        int expectedValue = 8;
        int actualValue = sumOfIntergesobject.integerSum(string);
        assertEquals(expectedValue,actualValue);
    }
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testSumOfIntergersTestFailure() {
        String string =" ";
        int actualValue = sumOfIntergesobject.integerSum(string);
        assertNull(actualValue);
    }
}