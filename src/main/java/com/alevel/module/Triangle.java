package com.alevel.module;

public class Triangle {

    public int GetArea(Cord A, Cord B, Cord C) {
        if (A.y == B.y && B.x == A.x || C.y == A.y && C.x == A.x || B.x == C.x && C.y == B.y) return 0;
        return Math.abs((A.x - C.x) * (B.y - A.y) - (A.x - B.x) * (C.y - A.y))/2;
    }


    static public class Cord {
        int x;
        int y;

        public Cord(int x, int y) {

            this.x = x;
            this.y = y;
        }

    }
}
