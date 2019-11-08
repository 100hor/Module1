package com.alevel.module;

import org.junit.Test;

import static org.junit.Assert.*;

public class BracketsTest {

    @Test
    public void checkString() {
        boolean res = new Brackets().checkString("({[]})");
        assertTrue(res);

    }

    @Test
    public void checkString2() {
        boolean res = new Brackets().checkString("({[]})");
        assertTrue(res);

    }
    @Test
    public void checkString3() {
        boolean res = new Brackets().checkString("({[]}})");
        assertFalse(res);

    }
    @Test
    public void checkStringNull() {
        boolean res = new Brackets().checkString("");
        assertTrue(res);

    }

    @Test
    public void checkString5() {
        boolean res = new Brackets().checkString("(})");
        assertFalse(res);

    }
}