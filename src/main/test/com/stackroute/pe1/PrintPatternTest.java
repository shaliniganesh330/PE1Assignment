package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintPatternTest {
    PrintPattern printPattern;
    @Before
    public void setUp() throws Exception {
        printPattern = new PrintPattern();
    }

    @After
    public void tearDown() throws Exception {
        printPattern = null;
    }

    @Test
    public void testPatternTestSuccess() {
      String expectedValue = "122333";
      String actualValue = printPattern.patternCheck(3);
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void testPatternFailure() {
        String expectedValue = "1223334444";
        String actualValue = printPattern.patternCheck(3);
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void testPatternTestFailure() {
        String expectedValue = "1223334444";
        String actualValue = printPattern.patternCheck(3);
        assertNotNull(expectedValue,actualValue);
    }
}
