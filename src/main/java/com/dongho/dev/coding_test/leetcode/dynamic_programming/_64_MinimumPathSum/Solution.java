package com.dongho.dev.coding_test.leetcode.dynamic_programming._64_MinimumPathSum;

public class Solution {

    private int[][] grid;
    private int[][] dp;
    private int yEnd;
    private int xEnd;

    private int getPathSum(int y, int x) {
        if (dp[y][x] >= 1) {
            return dp[y][x];
        }

        if (y == yEnd && x == xEnd) {
            return grid[y][x];
        }

        if (y < yEnd && x < xEnd) {
            dp[y][x] = grid[y][x] +
                Math.min(getPathSum(y, x + 1), getPathSum(y + 1, x));
        } else if (y < yEnd) {
            dp[y][x] = grid[y][x] + getPathSum(y + 1, x);
        } else if (x < xEnd) {
            dp[y][x] = grid[y][x] + getPathSum(y, x + 1);
        }
        return dp[y][x];
    }

    public int minPathSum(int[][] grid) {
        this.grid = grid;
        this.dp = new int[grid.length][grid[0].length];
        this.yEnd = grid.length - 1;
        this.xEnd = grid[0].length - 1;

        return getPathSum(0, 0);
    }

}
