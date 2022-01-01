package com.dongho.dev.coding_test.leetcode.binary_search._74_SearchA2DMatrix;

public class Solution {

    private int searchIndex(int[] matrix, int target) {
        int start = 0;
        int end = matrix.length;
        int mid = (start + end) / 2;

        while (end - start >= 1) {
            int val = matrix[mid];

            if (val == target) {
                break;
            }

            if (val < target) {
                start = mid + 1;
            } else {
                end = mid;
            }

            mid = (start + end) / 2;
        }

        return mid;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int[] firstColumns = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            firstColumns[i] = matrix[i][0];
        }

        int row = searchIndex(firstColumns, target);
        if (row >= matrix.length || matrix[row][0] > target) {
            row = Math.max(0, row - 1);
        }

        int col = searchIndex(matrix[row], target);
        if (col >= matrix[row].length) {
            col = Math.max(0, col - 1);
        }

        if (matrix[row][col] == target) {
            return true;
        }
        return false;
    }

}
