package com.dongho.dev.coding_test.leetcode.dynamic_programming._63_UniquePaths2;

import java.util.Arrays;

public class Solution {

    private int[][] grid;
    private int xEndPos;
    private int yEndPos;
    private int[][] dp;

    public int getCount(int y, int x) {
        if (dp[y][x] >= 0) {
            return dp[y][x];
        }

        if (grid[y][x] == 1) {
            return dp[y][x] = 0;
        }

        if (y == yEndPos - 1 && x == xEndPos - 1) {
            return 1;
        }

        if (y == yEndPos - 1) {
            dp[y][x] = getCount(y, x + 1);
        } else if (x == xEndPos - 1) {
            dp[y][x] = getCount(y + 1, x);
        } else {
            dp[y][x] = getCount(y, x + 1) + getCount(y + 1, x);
        }

        return dp[y][x];
    }
    
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        grid = obstacleGrid;
        yEndPos = grid.length;
        xEndPos = grid[0].length;

        dp = new int[yEndPos][xEndPos];

        for (int i = 0; i < yEndPos; i++) {
            Arrays.fill(dp[i], -1);
        }

        return getCount(0, 0);
    }

}
