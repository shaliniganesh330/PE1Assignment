package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTheCharTest {
    CheckTheChar characterobject;

    @Before
    public void setUp() throws Exception {
        characterobject = new CheckTheChar();
    }

    @After
    public void tearDown() throws Exception {
        characterobject = null;
    }

    @Test
    public void charchecksuccess() {
        String expectedValue = "Small letter";
        String actualValue = characterobject.charCheck('a');
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void charCheckTestSuccess() {
        String expectedValue = "Capital letter";
        String actualValue = characterobject.charCheck('A');
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void charCheckSuccess() {
        String expectedValue = "Digit";
        String actualValue = characterobject.charCheck('1');
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void charCheckSuccesss() {
        String expectedValue = "Special character";
        String actualValue = characterobject.charCheck('!');
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void charCheckFailure() {
        String expectedValue = "Special character";
        String actualValue = characterobject.charCheck('A');
        assertNotEquals(expectedValue, actualValue);
    }
}