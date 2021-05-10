package com.dongho.dev.practice.recursion;

public class Power {

    public static double iterPower(double x, int n) {
        double r = 1.0d;

        for (int i = 0; i < n; i++) {
            r = r * x;
        }

        return r;
    }

    public static double recurPower(double x, int n) {
        if (n == 0) {
            return 1.0d;
        }

        if (n % 2 == 0) {
            return recurPower(x * x, n / 2);
        }

        return x * recurPower(x * x, (n - 1) / 2);
    }

}
