package com.dongho.dev.practice.recursion;

public class Hanoi {

    public static void move(int n, int[] from, int[] tmp, int[] to) {
        if (n == 1) {
            to[0] = from[0];
            from[0] = 0;
        }
        else {
            move(n - 1, from, to, tmp);
            to[n - 1] = from[n - 1];
            from[n - 1] = 0;
            move(n - 1, tmp, from, to);
        }
    }

}
