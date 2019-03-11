package com.soft1841.holiday;

public class Test5 {
    public static void main(String[] args) {
        int[] s;
        s = new int[5];
        for (int i = 0; i<5; i++) {
            s[i] = i;
        }
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println("a[" + i + "]=" + s[i] + " ");
        }
    }
}
