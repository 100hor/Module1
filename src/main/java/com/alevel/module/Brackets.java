package com.alevel.module;

import java.util.ArrayList;
import java.util.Stack;

public class Brackets {


    public boolean checkString(String s) {
        if (s.length() == 0) return true;
        ArrayList<Character> opclose = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
                opclose.add(s.charAt(i));
        }
        if (opclose.size() % 2 != 0) return false;
        for (int i = 0; i < opclose.size() / 2; i++) {
            if (opclose.get(i).equals(opclose.get(i + (opclose.size() - (i + 1))))) {
                return false;
            }
        }

        return true;
    }

}
