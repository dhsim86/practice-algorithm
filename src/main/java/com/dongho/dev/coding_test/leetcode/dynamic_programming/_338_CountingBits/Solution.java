package com.dongho.dev.coding_test.leetcode.dynamic_programming._338_CountingBits;

public class Solution {

    private int[] dp;

    // 0            0
    // 1            1
    // 10           1 + 0, 1
    // 11           1 + 1, 2
    // 100          1 + 0, 1
    // 101          1 + 1, 2
    // 110          2 + 0, 2
    // 111          2 + 1, 3
    // 1000         1 + 0, 1
    // 1001         1 + 1, 2
    // 1010         2 + 0, 2
    public int getCount(int n) {
        if (n <= 1) {
            return dp[n] = n;
        }

        if (dp[n] > 0) {
            return dp[n];
        }

        dp[n] = getCount(n / 2) + getCount(n % 2);
        return dp[n];
    }

    public int[] countBits(int n) {
        this.dp = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            this.dp[i] = getCount(i);
        }

        return dp;
    }
    
}
