package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber guessnumberobject;
    @Before
    public void setUp() throws Exception {
        guessnumberobject = new GuessNumber();
    }

    @After
    public void tearDown() throws Exception {
        guessnumberobject = null;
    }


    @Test
    public void testGuessSuccess() {
        String expectedValue = "Number guessed is lesser";
        String actualValue = guessnumberobject.guess(1);
        assertEquals(expectedValue, actualValue);

        String expectedValue1 = "Number guessed is greater";
        String actualValue1 = guessnumberobject.guess(67);
        assertEquals(expectedValue1, actualValue1);

        String expectedValue2 = "Number guessed is correct";
        String actualValue2 = guessnumberobject.guess(29);
        assertEquals(expectedValue2, actualValue2);
    }
    @Test
    public void testCheckNumberFailure() {
        String expectedValue = "null";
        //Act
        String actualValue = guessnumberobject.guess(-1);
        //Assert
        assertEquals(expectedValue,actualValue);
    }
}