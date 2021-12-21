package com.dongho.dev.coding_test.leetcode.binary_search._74_SearchA2DMatrix;

public class Solution {

    private int searchIndex(int[] array, int target) {
        int start = 0;
        int end = array.length;
        int mid = (start + end) / 2;

        while (end - start >= 1) {
            if (target == array[mid]) {
                return mid;
            }

            if (target < array[mid]) {
                end = mid;
            } else {
                start = mid + 1;
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
        if (row == matrix.length || matrix[row][0] > target) {
            row = Math.max(0, row - 1);
        }

        int[] columns = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            columns[i] = matrix[row][i];
        }

        int col = searchIndex(columns, target);
        if (col == matrix[0].length) {
            col = Math.max(0, col - 1);
        }

        return matrix[row][col] == target ? true : false;
    }

}
