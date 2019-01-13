package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTheStringTest {
    ReverseTheString srtingobject;
    @Before
    public void setUp() throws Exception {
        srtingobject = new ReverseTheString();
    }

    @After
    public void tearDown() throws Exception {
        srtingobject =null;
    }

    @Test
    public void testReverseSuccess() {
        String expectedValue="abcde";
        String actualValue = srtingobject.reverseTheString("edcba");
        assertEquals(expectedValue,actualValue);
    }
    @Test
    public void testReverseFailure() {
        String expectedValue="abde";
        String actualValue = srtingobject.reverseTheString("edcba");
        assertNotEquals(expectedValue,actualValue);
    }
    @Test
    public void testReverseTestSuccess() {
        String expectedValue="abcdefghi";
        String actualValue = srtingobject.reverseTheString("ihgfedcba");
        assertEquals(expectedValue,actualValue);
    }

}