package com.alevel.module;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void getArea() {
        Triangle.Cord b = new Triangle.Cord(1, 2);
        Triangle.Cord a = new Triangle.Cord(1, 4);
        Triangle.Cord c = new Triangle.Cord(5, 3);
        int res = new Triangle().GetArea(a, b, c);
        int exp = 4;
        assertEquals(exp, res);
    }

    @Test
    public void getAreaOneDot() {
        Triangle.Cord b = new Triangle.Cord(1, 2);
        Triangle.Cord a = new Triangle.Cord(1, 2);
        Triangle.Cord c = new Triangle.Cord(5, 3);
        int res = new Triangle().GetArea(a, b, c);
        int exp = 0;
        assertEquals(exp, res);
    }

    @Test
    public void getAreaAllOneDot() {
        Triangle.Cord b = new Triangle.Cord(1, 2);
        Triangle.Cord a = new Triangle.Cord(1, 2);
        Triangle.Cord c = new Triangle.Cord(1, 2);
        int res = new Triangle().GetArea(a, b, c);
        int exp = 0;
        assertEquals(exp, res);
    }


}