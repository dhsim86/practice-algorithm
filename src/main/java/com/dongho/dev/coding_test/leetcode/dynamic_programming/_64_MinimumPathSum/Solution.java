package com.dongho.dev.coding_test.leetcode.dynamic_programming._64_MinimumPathSum;

import java.util.Arrays;

public class Solution {

    private int[][] grid;
    private int[][] dp;
    private int xEndPos;
    private int yEndPos;

    private int getMinimumPath(int y, int x) {
        if (dp[y][x] >= 0) {
            return dp[y][x];
        }

        if (y == yEndPos - 1 && x == xEndPos - 1) {
            return grid[y][x];
        }

        if (y == yEndPos - 1) {
            dp[y][x] = getMinimumPath(y, x + 1) + grid[y][x];
        } else if (x == xEndPos - 1) {
            dp[y][x] = getMinimumPath(y + 1, x) + grid[y][x];
        } else {
            dp[y][x] = Math.min(getMinimumPath(y, x + 1) + grid[y][x], getMinimumPath(y + 1, x) + grid[y][x]);
        }

        return dp[y][x];
    }
    
    public int minPathSum(int[][] grid) {
        this.grid = grid;
        yEndPos = grid.length;
        xEndPos = grid[0].length;
        dp = new int[yEndPos][xEndPos];

        for (int i = 0; i < yEndPos; i++) {
            Arrays.fill(dp[i], -1);
        }

        return getMinimumPath(0, 0);
    }

}
