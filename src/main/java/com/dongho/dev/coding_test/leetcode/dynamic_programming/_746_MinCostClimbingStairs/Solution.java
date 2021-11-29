package com.dongho.dev.coding_test.leetcode.dynamic_programming._746_MinCostClimbingStairs;

public class Solution {

    // dp[n] = min(dp[n - 1], dp[n - 2])
    private int[] dp;

    private int step(int[] costs, int step) {
        if (step >= costs.length) {
            return 0;
        }

        if (dp[step] > 0) {
            return dp[step];
        }

        int curCost = costs[step];

        dp[step] = Math.min(curCost + step(costs, step + 1), curCost + step(costs, step + 2));
        return dp[step];
    }


    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        return Math.min(step(cost, 0), step(cost, 1));
    }

}
