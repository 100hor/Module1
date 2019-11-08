package com.alevel.module;

public class FindUniq {
    public int findUniq(int[] arr) {
        if (arr.length == 0) return 0;
        if (arr.length == 1) return 1;
        int count = arr.length;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}
