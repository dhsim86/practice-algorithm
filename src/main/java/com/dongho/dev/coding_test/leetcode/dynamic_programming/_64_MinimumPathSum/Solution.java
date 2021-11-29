package com.dongho.dev.coding_test.leetcode.dynamic_programming._64_MinimumPathSum;

public class Solution {

    private int[][] grid;
    private int m;
    private int n;

    // dp[y][x] = min(dp[y + 1][x], dp[y][x + 1])
    // y == m && x == m => return
    private int[][] dp;

    private int walk(int y, int x) {
        if (y >= m || x >= n) {
            return Short.MAX_VALUE;
        }

        if (dp[y][x] > 0) {
            return dp[y][x];
        }

        if (y == m - 1 && x == n - 1) {
            return grid[y][x];
        }

        dp[y][x] = grid[y][x] + Math.min(walk(y + 1, x), walk(y, x + 1));
        return dp[y][x];
    }


    public int minPathSum(int[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;
        this.dp = new int[m][n];

        return walk(0, 0);
    }

}
