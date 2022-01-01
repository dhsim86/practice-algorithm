package com.dongho.dev.coding_test.leetcode.dynamic_programming._70_climbling_stairs;

public class Solution {

    // dp[n] = (dp[n - 2] + dp[n - 1])
    // n == 0 => count++;
    private int[] dp;

    private int walk(int n) {
        if (n < 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        if (dp[n] > 0) {
            return dp[n];
        }

        dp[n] = walk(n - 2) + walk(n - 1);
        return dp[n];
    }

    public int climbStairs(int n) {
        dp = new int[n + 1];
        return walk(n);
    }

}
