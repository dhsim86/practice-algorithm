package com.dongho.dev.coding_test.leetcode.dynamic_programming._70_climbling_stairs;

public class Solution {
    
    // dp[n] = dp[n - 1] + dp[n - 2]

    // dp[1] = 1
    // dp[2] = 2
    
    // dp[3] = dp[1] + dp[2]
    //  1 + 2
    //  2 + 1

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int dp[] = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

}
