package com.dongho.dev.coding_test.leetcode.dynamic_programming._62_UniquePaths;

public class Solution {

    private int xEndPos;
    private int yEndPos;
    private int[][] dp;

    public int getCount(int y, int x) {
        if (dp[y][x] > 0) {
            return dp[y][x];
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
    
    public int uniquePaths(int m, int n) {
        yEndPos = m;
        xEndPos = n;

        dp = new int[yEndPos][xEndPos];

        return getCount(0, 0);
    }

}
