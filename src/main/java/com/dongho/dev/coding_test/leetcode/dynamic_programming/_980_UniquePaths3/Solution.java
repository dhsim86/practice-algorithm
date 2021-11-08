package com.dongho.dev.coding_test.leetcode.dynamic_programming._980_UniquePaths3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {

    private int[][] dp;
    private int[][] grid;
    private boolean[][] visited;

    private int xEnd;
    private int yEnd;

    private boolean checkBoundEx(int x, int y) {
        if (x < 0 || y < 0 || x >= xEnd || y >= yEnd) {
            return true;
        }
        return false;
    }

    private boolean isAllVisited() {
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[0].length; j++) {
                if (visited[i][j] == false) {
                    return false;
                }
            }
        }
        return true;
    }

    private int getCount(int x, int y) {
        if (checkBoundEx(x, y)) {
            return 0;
        }
        if (visited[x][y]) {
            return 0;
        }

        if (dp[x][y] > 0) {
            if (isAllVisited()) {
                return dp[x][y];
            }
            return 0;
        }

        if (grid[x][y] == -1) {
            return 0;
        }

        visited[x][y] = true;

        if (grid[x][y] == 2) {
            int result = 0;
            if (isAllVisited()) {
                log.info("complete x: {}, y: {}", y, x);
                result = 1;
            }
            visited[x][y] = false;
            return result;
        }

        dp[x][y] = getCount(x + 1, y) +
            getCount(x, y + 1) + 
            getCount(x - 1, y) +
            getCount(x, y - 1);

        visited[x][y] = false;

        return dp[x][y];
    }

    public int uniquePathsIII(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        visited = new boolean[grid.length][grid[0].length];
        this.grid = grid;

        xEnd = dp.length;
        yEnd = dp[0].length;

        int xStart = 0;
        int yStart = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    xStart = i;
                    yStart = j;
                } else if (grid[i][j] == -1) {
                    visited[i][j] = true;
                }
            }
        }

        return getCount(xStart, yStart);
    }
}
