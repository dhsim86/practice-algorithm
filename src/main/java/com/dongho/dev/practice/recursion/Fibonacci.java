package com.dongho.dev.practice.recursion;

public class Fibonacci {

    // f(0) => 0
    // f(1) => 1
    // f(n) => f(n - 1) + f(n - 2);

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

    public static int fibIteration(int n) {
        fibMemoizationArray[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibMemoizationArray[i] = fibMemoizationArray[i - 2] + fibMemoizationArray[i - 1];
        }

        return fibMemoizationArray[n];
    }

}
