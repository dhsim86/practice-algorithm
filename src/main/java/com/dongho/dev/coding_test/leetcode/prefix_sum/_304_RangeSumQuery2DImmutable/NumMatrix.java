package com.dongho.dev.coding_test.leetcode.prefix_sum._304_RangeSumQuery2DImmutable;

public class NumMatrix {

    private int[][] prefixSums;

    public NumMatrix(int[][] matrix) {
        prefixSums = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            prefixSums[i][0] = matrix[i][0];

            for (int j = 1; j < matrix[0].length; j++) {
                prefixSums[i][j] = prefixSums[i][j - 1] + matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;

        for (int i = row1; i <= row2; i++) {
            sum += prefixSums[i][col2] - (col1 == 0 ? 0 : prefixSums[i][col1 - 1]);
        }

        return sum;
    }

}
