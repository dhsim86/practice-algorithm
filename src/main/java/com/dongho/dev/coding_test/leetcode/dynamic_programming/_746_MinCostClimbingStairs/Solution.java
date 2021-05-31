package com.dongho.dev.coding_test.leetcode.dynamic_programming._746_MinCostClimbingStairs;

public class Solution {

    private int[] dp;

    public int getMinimumCost(int[] cost, int n) {
        if (n <= 1) {
            return 0;
        }

        if (dp[n] > 0) {
            return dp[n];
        }

        dp[n] = Math.min(getMinimumCost(cost, n - 2) + cost[n - 2], getMinimumCost(cost, n - 1) + cost[n - 1]);
        return dp[n];
    }

    public int minCostClimbingStairs(int[] cost) {
        this.dp = new int[cost.length + 1];
        return getMinimumCost(cost, cost.length);
    }

}
