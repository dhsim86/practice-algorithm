package com.dongho.dev.coding_test.leetcode.dynamic_programming._63_UniquePaths2;

public class Solution {

    // dp[y][x] = dp[y + 1][x] + dp[y][x + 1];
    // y == m && x == n ? 1 : 0
    // dp[y][x] == 1 ? 0

    private int[][] dp;
    private int[][] obstacleGrid;

    private int m;
    private int n;

    private int walk(int y, int x) {
        if (y >= m || x >= n) {
            return 0;
        }

        if (obstacleGrid[y][x] == 1) {
            return 0;
        }

        if (y == m - 1 && x == n - 1) {
            return 1;
        }

        if (dp[y][x] > 0) {
            return dp[y][x];
        }

        dp[y][x] = walk(y + 1, x) + walk(y, x + 1);
        return dp[y][x];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        this.dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        this.obstacleGrid = obstacleGrid;
        this.m = obstacleGrid.length;
        this.n = obstacleGrid[0].length;

        return walk(0, 0);
    }

}
