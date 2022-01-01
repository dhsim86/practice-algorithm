package com.dongho.dev.coding_test.leetcode.dynamic_programming._63_UniquePaths2;

public class Solution {

    // dp[y][x] = dp[y + 1][x] + dp[y][x + 1];
    // 1 <== y == m - 1 && x == n - 1
    // 0 <== obstacleGrid[y][x] == 1
    private int[][] dp;

    private int walk(int y, int x, int[][] obstacleGrid) {
        if (y >= dp.length || x >= dp[0].length) {
            return 0;
        }

        if (obstacleGrid[y][x] == 1) {
            return 0;
        }

        if (y == dp.length - 1 && x == dp[0].length - 1) {
            return 1;
        }

        if (dp[y][x] > 0) {
            return dp[y][x];
        }

        dp[y][x] = walk(y + 1, x, obstacleGrid) + walk(y, x + 1, obstacleGrid);
        return dp[y][x];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        dp = new int[obstacleGrid.length][obstacleGrid[0].length];

        int result = walk(0, 0, obstacleGrid);
        return result;
    }

}
