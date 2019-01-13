package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {
    PalindromeCheck number;
    @Before
    public void setUp() throws Exception {
        number =new PalindromeCheck();
    }

    @After
    public void tearDown() throws Exception {
        number = null;
    }

    @Test
    public void testPalindromeSuccess() throws Exception
    {
        long num_1 = 988889;
        String expectedValue_1 = "number is PalindromeCheck and sum of even is greater than 25";
        //Act
        String actualValue_1 = number.palindromeCheck(num_1);
        // Assert
        assertEquals(expectedValue_1,actualValue_1);

        long num_2 = 1234321;
        String expectedValue_2 = "number is PalindromeCheck and sum of even is lesser than 25";
        //Act
        String actualValue_2 = number.palindromeCheck(num_2);
        //Assert
        assertEquals(expectedValue_2,actualValue_2);
    }
    @Test
    public void testPalindromeFailure() throws Exception
    {
        long num = 123432;
        String expectedValue = "not a Palidrome";
        //Act
        String actualValue = number.palindromeCheck(num);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
}
