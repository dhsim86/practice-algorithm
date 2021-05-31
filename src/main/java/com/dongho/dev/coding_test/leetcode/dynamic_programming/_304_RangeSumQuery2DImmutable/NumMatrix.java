package com.dongho.dev.coding_test.leetcode.dynamic_programming._304_RangeSumQuery2DImmutable;

public class NumMatrix {

    private int[][] matrix;
    private int[][] dp;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;
        this.dp = new int[matrix.length][matrix[0].length + 1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                dp[i][j + 1] = this.matrix[i][j] + dp[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;

        for (int i = row1; i <= row2; i++) {
            sum += this.dp[i][col2 + 1] - this.dp[i][col1];
        }

        return sum;
    }
    
}
