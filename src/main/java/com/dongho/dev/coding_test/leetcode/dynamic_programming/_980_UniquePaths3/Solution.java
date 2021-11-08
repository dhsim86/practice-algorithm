package com.dongho.dev.coding_test.leetcode.dynamic_programming._980_UniquePaths3;

public class Solution {

    // no: 0
    // 
    private int[][] dp;

    private int[][] grid;
    private boolean[][] visited;
    private int remainCount = 0;

    private boolean checkBound(int y, int x) {
        if (y < 0 || x < 0 || y >= grid.length || x >= grid[0].length) {
            return true;
        }
        return false;
    }
    
    private int getCount(int y, int x) {
        if (checkBound(y, x) || visited[y][x]) {
            return 0;
        }

        if (remainCount == 0 && dp[y][x] > 0) {
            return dp[y][x];
        }

        if (grid[y][x] == -1) {
            return 0;
        }

        if (grid[y][x] == 2) {
            if (remainCount == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        visited[y][x] = true;
        remainCount--;

        dp[y][x] = getCount(y, x + 1) + getCount(y + 1, x) + getCount(y, x - 1) + getCount(y - 1, x);

        visited[y][x] = false;
        remainCount++;
        return dp[y][x];
    }


    public int uniquePathsIII(int[][] grid) {
        this.grid = grid;
        this.remainCount = grid.length * grid[0].length;

        dp = new int[grid.length][grid[0].length];
        visited = new boolean[grid.length][grid[0].length];
        int startY = 0;
        int startX = 0;
        
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == 1) {
                    startY = y;
                    startX = x;
                } else if (grid[y][x] == -1 || grid[y][x] == 2) {
                    remainCount--;
                }
            }
        }

        int count = getCount(startY, startX);
        return count;
    }
}
