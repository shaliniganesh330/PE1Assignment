package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatTheStringTest {
    RepeatTheString stringobject;
    @Before
    public void setUp() throws Exception {stringobject=new RepeatTheString();
    }

    @After
    public void tearDown() throws Exception {stringobject=null;
    }
    @Test
    public void testRepeatTheStringSuccess(){
        String expected ="stackckck";
        assertEquals(expected,stringobject.repeatSubstring("stack",2));
    }
    @Test
    public void testRepeatTheStringFailure(){
        String expected ="stackckkkk";
        assertNotEquals(expected,stringobject.repeatSubstring("stack",2));
    }
    @Test
    public void testRepeatTheStringSuccesss(){
        String expected ="stackrouterouterouterouterouteroute";
        assertEquals(expected,stringobject.repeatSubstring("stackroute",5));
    }
}