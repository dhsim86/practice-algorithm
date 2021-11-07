package com.dongho.dev.coding_test.leetcode.dynamic_programming._62_UniquePaths;

public class Solution {

    private int[][] dp;
    private int m;
    private int n;

    private int getCount(int x, int y) {
        if (dp[x][y] > 0) {
            return dp[x][y];
        }

        if (x == m - 1 && y == n - 1) {
            return 1;
        }

        if (x == m - 1) {
            dp[x][y] = getCount(x, y + 1);
        } else if (y == n - 1) {
            dp[x][y] = getCount(x + 1, y);
        } else {
            dp[x][y] = getCount(x + 1, y) + getCount(x, y + 1);
        }

        return dp[x][y];
    }

    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        this.m = m;
        this.n = n;

        return getCount(0, 0);
    }

}
