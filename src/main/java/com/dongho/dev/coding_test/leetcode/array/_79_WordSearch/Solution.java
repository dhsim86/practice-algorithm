package com.dongho.dev.coding_test.leetcode.array._79_WordSearch;

public class Solution {

    private String word;
    private char[][] board;
    private boolean[][] visited;

    private boolean visit(int y, int x, int cur) {
        if (cur == word.length()) {
            return true;
        }

        if (y < 0 || x < 0 || y >= board.length || x >= board[0].length) {
            return false;
        }

        if (visited[y][x]) {
            return false;
        }

        visited[y][x] = true;
        boolean result = false;

        if (board[y][x] == word.charAt(cur)) {
            result = visit(y, x + 1, cur + 1) || visit(y + 1, x, cur + 1) ||
                visit(y, x - 1, cur + 1) || visit(y - 1, x, cur + 1);
        }

        visited[y][x] = false;

        return result;
    }

    public boolean exist(char[][] board, String word) {
        this.word = word;
        this.board = board;
        this.visited = new boolean[board.length][board[0].length];

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                if (visit(y, x, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

}
