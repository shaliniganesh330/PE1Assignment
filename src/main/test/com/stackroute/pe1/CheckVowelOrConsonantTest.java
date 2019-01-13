package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckVowelOrConsonantTest {
    CheckVowelOrConsonant characterobject;
    @Before
    public void setUp() throws Exception {
        characterobject = new CheckVowelOrConsonant();
    }

    @After
    public void tearDown() throws Exception {
        characterobject = null;
    }

    @Test
    public void vowelOrConsonantSuccess() {
        String expectedValue = "vowel";
        String actualValue = characterobject.vowelOrConsonant("a");
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void testVowelOrConsonantSuccess() {
        String expectedValue = "consonant";
        String actualValue= characterobject. vowelOrConsonant("c");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void testvowelOrConsonantFailure() {
        String expectedValue = "consonant";
        String actualValue= characterobject. vowelOrConsonant("o");
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void testvowelOrConsonantFailuree() {
        String expectedValue = "vowel";
        String actualValue= characterobject. vowelOrConsonant("z");
        assertNotEquals(expectedValue,actualValue);
    }
}