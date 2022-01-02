package com.dongho.dev.coding_test.leetcode.dynamic_programming._746_MinCostClimbingStairs;

public class Solution {

    // dp[n] = Math.min(dp[n - 2], dp[n - 1]);
    private int[] dp;
    private int[] cost;

    private int calculate(int n) {
        if (n < 0) {
            return 0;
        }

        if (dp[n] > 0) {
            return dp[n];
        }

        dp[n] = Math.min(calculate(n - 2), calculate(n - 1)) + cost[n];
        return dp[n];
    }

    public int minCostClimbingStairs(int[] cost) {
        this.dp = new int[cost.length];
        this.cost = cost;

        return Math.min(calculate(cost.length - 1), calculate(cost.length - 2));
    }

}
