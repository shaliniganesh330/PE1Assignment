package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTheNumbersTest {
    SortingTheNumbers sortingobject;
    @Before
    public void setUp() throws Exception {
        sortingobject = new SortingTheNumbers();
    }

    @After
    public void tearDown() throws Exception {
        sortingobject = null;
    }

    @Test
    public void testSortingTestSucess() {
    int expectedValue = 10;
    int actualValue = sortingobject.sortingTheNumbers(23242);
    assertEquals(expectedValue,actualValue);
    }
    @Test
    public void testSortingFailure() {
        int expectedValue = 100;
        int actualValue = sortingobject.sortingTheNumbers(23242);
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void testSortingTestFailure() {
        int expectedValue = 20;
        int actualValue = sortingobject.sortingTheNumbers(2344442);
        assertEquals(expectedValue,actualValue);
    }
}