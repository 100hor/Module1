package com.alevel.module;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChessTest {

    @Test
    public void canHorseMove() {
        Chess.Cord start = new Chess.Cord(1, 1);
        Chess.Cord finish = new Chess.Cord(2, 3);
        boolean res = new Chess().canHorseMove(start, finish);
        assertTrue(res);


    }

    @Test
    public void canHorseMoveFalse() {
        Chess.Cord start = new Chess.Cord(1, 1);
        Chess.Cord finish = new Chess.Cord(2, 4);
        boolean res = new Chess().canHorseMove(start, finish);
        assertFalse(res);


    }

    @Test
    public void canHorseMoveOutOfBoard() {
        Chess.Cord start = new Chess.Cord(1, 1);
        Chess.Cord finish = new Chess.Cord(2, 9);
        boolean res = new Chess().canHorseMove(start, finish);
        assertFalse(res);


    }

    @Test
    public void canHorseMoveNotMove() {
        Chess.Cord start = new Chess.Cord(1, 1);
        Chess.Cord finish = new Chess.Cord(1, 1);
        boolean res = new Chess().canHorseMove(start, finish);
        assertFalse(res);


    }
}