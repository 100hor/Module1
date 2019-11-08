package com.alevel.module;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindUniqTest {

    @Test
    public void findUniqTest() {
        int res = new FindUniq().findUniq(new int[]{1, 4, 5, 1, 1, 3});
        int exp = 4;
        assertEquals(exp, res);
    }

    @Test
    public void findUniqTest2() {
        int res = new FindUniq().findUniq(new int[]{1, 1, 5});
        int exp = 2;
        assertEquals(exp, res);
    }

    @Test
    public void findUniqTestAllSame() {
        int res = new FindUniq().findUniq(new int[]{1, 4, 5, 3, 6});
        int exp = 5;
        assertEquals(exp, res);
    }


    @Test
    public void findUniqTestNull() {
        int res = new FindUniq().findUniq(new int[]{});
        int exp = 0;
        assertEquals(exp, res);
    }

    @Test
    public void findUniqTestOne() {
        int res = new FindUniq().findUniq(new int[]{5});
        int exp = 1;
        assertEquals(exp, res);
    }
}