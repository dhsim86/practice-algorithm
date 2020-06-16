package com.dongho.dev.practice.recursion;

public class Fibonacci {

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fib(n - 2) + fib(n - 1);
    }

    public static int[] fibMemoizationArray;

    public static void initFibMemoizationList(int n) {
        fibMemoizationArray = new int[n + 1];
    }

    public static int fibMemoization(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        if (fibMemoizationArray[n] != 0) {
            return fibMemoizationArray[n];
        }

        fibMemoizationArray[n] = fibMemoization(n - 1) + fibMemoization(n - 2);
        return fibMemoizationArray[n];
    }

}
