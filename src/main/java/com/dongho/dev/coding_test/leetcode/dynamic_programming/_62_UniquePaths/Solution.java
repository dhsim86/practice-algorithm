package com.dongho.dev.coding_test.leetcode.dynamic_programming._62_UniquePaths;

public class Solution {

    private int[][] dp;
    private int m;
    private int n;

    // dp[y][x] = dp[y + 1][x] + dp[y][x + 1];
    // y == m && x == n ? 1 : 0

    private int walk(int y, int x) {
        if (y == m - 1 && x == n - 1) {
            return 1;
        }

        if (y >= m || x >= n) {
            return 0;
        }

        if (dp[y][x] > 0) {
            return dp[y][x];
        }

        dp[y][x] = walk(y + 1, x) + walk(y, x + 1);
        return dp[y][x];
    }

    public int uniquePaths(int m, int n) {
        this.dp = new int[m][n];
        this.m = m;
        this.n = n;

        return walk(0, 0);
    }

}
