package com.dongho.dev.coding_test.leetcode.dynamic_programming._62_UniquePaths;

public class Solution {

    // dp = dp[y + 1][x] + dp[y][x + 1];
    // y == m - 1 && x == n - 1 => 1
    private int[][] dp;

    private int walk(int y, int x) {
        if (y >= dp.length || x >= dp[0].length) {
            return 0;
        }

        if (y == dp.length - 1 && x == dp[0].length - 1) {
            return 1;
        }

        dp[y][x] = walk(y + 1, x) + walk(y, x + 1);
        return dp[y][x];
    }



    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        
        int result = walk(0, 0);
        return result;
    }

}
