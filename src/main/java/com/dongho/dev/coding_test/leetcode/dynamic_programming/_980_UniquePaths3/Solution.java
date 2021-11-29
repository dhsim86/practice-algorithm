package com.dongho.dev.coding_test.leetcode.dynamic_programming._980_UniquePaths3;

public class Solution {

    private int[][] grid;
    private int m;
    private int n;

    private boolean[][] visited;
    private int remainCount = 0;

    private int walk(int y, int x) {
        if (y >= m || x >= n || y < 0 || x < 0) {
            return 0;
        }

        if (visited[y][x]) {
            return 0;
        }

        if (grid[y][x] == -1) {
            return 0;
        }

        if (grid[y][x] == 2 && remainCount == 0) {
            return 1;
        }

        visited[y][x] = true;
        remainCount--;

        int result = walk(y, x + 1) + walk(y + 1, x) + walk(y, x - 1) + walk(y - 1, x);

        visited[y][x]= false;
        remainCount++;

        return result;
    }

    public int uniquePathsIII(int[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;

        this.visited = new boolean[m][n];
        this.remainCount = m * n;

        int startX = 0;
        int startY = 0;

        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == 2 || grid[y][x] == -1) {
                    remainCount--;
                }

                if (grid[y][x] == 1) {
                    startY = y;
                    startX = x;
                }
            }
        }

        return walk(startY, startX);
    }

}
