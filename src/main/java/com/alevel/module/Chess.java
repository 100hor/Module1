package com.alevel.module;

public class Chess {
    public boolean canHorseMove(Cord pos, Cord mov) {
        if (pos.x > 8 || pos.y > 8 || mov.x > 8 || mov.y > 8) return false;
        if(pos.x < 1 || pos.y < 1 || mov.x < 1 || mov.y < 1) return false;
        if (Math.abs(pos.x - mov.x) == 2 && Math.abs(pos.y - mov.y) == 1 || Math.abs(pos.y - mov.y) == 2 && Math.abs(pos.x - mov.x) == 1)
            return true;
        else return false;
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


