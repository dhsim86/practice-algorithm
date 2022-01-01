package com.dongho.dev.coding_test.leetcode.dynamic_programming._64_MinimumPathSum;

public class Solution {

    private int[][] dp;

    private int walk(int y, int x, int[][] grid) {
        if (y >= grid.length || x >= grid[0].length) {
            return 10000;
        }

        if (y == grid.length - 1 && x == grid[0].length - 1) {
            return grid[y][x];
        }

        if (dp[y][x] > 0) {
            return dp[y][x];
        }

        dp[y][x] = grid[y][x] + Math.min(walk(y + 1, x, grid), walk(y, x + 1, grid));
        return dp[y][x];
    }

    public int minPathSum(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        return walk(0, 0, grid);   
    }

}
