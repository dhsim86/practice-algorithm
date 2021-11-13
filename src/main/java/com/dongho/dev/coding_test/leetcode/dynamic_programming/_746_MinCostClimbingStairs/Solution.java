package com.dongho.dev.coding_test.leetcode.dynamic_programming._746_MinCostClimbingStairs;

public class Solution {

    private int[] dp;

    private int step(int[] costs, int step, int cost) {
        if (step >= costs.length) {
            return 0;
        }

        if (dp[step] > 0) {
            return dp[step];
        }

        int curCost = costs[step];

        dp[step] = Math.min(curCost + step(costs, step + 1, cost + curCost),
            curCost + step(costs, step + 2, cost + curCost));
        return dp[step];
    }


    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        return Math.min(step(cost, 0, 0), step(cost, 1, 0));
    }

}
