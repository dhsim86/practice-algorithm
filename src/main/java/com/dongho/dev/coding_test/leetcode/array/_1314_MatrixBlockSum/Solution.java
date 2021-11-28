package com.dongho.dev.coding_test.leetcode.array._1314_MatrixBlockSum;

public class Solution {
    
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] answers = new int[mat.length][mat[0].length];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[0].length; j++) {
                int startI = Math.max(i - k, 0);
                int endI = Math.min(i + k, mat.length - 1);

                int startY = Math.max(j - k, 0);
                int endY = Math.min(j + k, mat[0].length - 1);

                int sum = 0;

                for (int x = startI; x <= endI; x++) {
                    for (int y = startY; y <= endY; y++) {
                        sum += mat[x][y];
                    }
                }
                answers[i][j] = sum;
            }
        }

        return answers;
    }

}
