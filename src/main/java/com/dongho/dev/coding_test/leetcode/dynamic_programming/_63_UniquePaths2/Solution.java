package com.dongho.dev.coding_test.leetcode.dynamic_programming._63_UniquePaths2;

public class Solution {

    private int[][] dp;
    private int[][] obstacleGrid;
    private int xEnd;
    private int yEnd;

    private int getCount(int x, int y) {
        if (dp[x][y] > 0) {
            return dp[x][y];
        }

        if (obstacleGrid[x][y] == 1) {
            return 0;
        }

        if (x == xEnd - 1 && y == yEnd - 1) {
            return 1;
        }

        if (x == xEnd - 1) {
            dp[x][y] = getCount(x, y + 1);
        } else if (y == yEnd - 1) {
            dp[x][y] = getCount(x + 1, y);
        } else {
            dp[x][y] = getCount(x + 1, y) + getCount(x, y + 1);
        }

        return dp[x][y];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        xEnd = dp.length;
        yEnd = dp[0].length;

        this.obstacleGrid = obstacleGrid;

        return getCount(0, 0);
    }

}
