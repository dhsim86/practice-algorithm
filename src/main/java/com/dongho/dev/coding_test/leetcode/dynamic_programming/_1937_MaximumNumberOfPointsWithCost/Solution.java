package com.dongho.dev.coding_test.leetcode.dynamic_programming._1937_MaximumNumberOfPointsWithCost;

public class Solution {

    private int[][] points;
    private long[][] dp;

    private long getCoordinate(int r, int c) {
        if (r >= points.length) {
            return 0;
        }

        if (dp[r][c] > 0) {
            return dp[r][c];
        }

        long max = Integer.MIN_VALUE;

        for (int i = 0; i < points[0].length; i++) {
            long result = points[r][c] + getCoordinate(r + 1, i) - Math.abs(c - i);

            if (result > max) {
                max = result;
            }
        }

        dp[r][c] = max;
        return dp[r][c];
    }

    public long maxPoints(int[][] points) {
        this.points = points;
        this.dp = new long[points.length][points[0].length];

        long max = Integer.MIN_VALUE;

        for (int c = 0; c < points[0].length; c++) {
            max = Math.max(getCoordinate(0, c), max);
        }

        return max;
    }
}
