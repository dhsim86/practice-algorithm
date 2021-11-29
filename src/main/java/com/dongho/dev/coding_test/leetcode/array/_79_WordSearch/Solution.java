package com.dongho.dev.coding_test.leetcode.array._79_WordSearch;

public class Solution {

    private char[][] board;
    private boolean[][] visited;
    private String word;

    private boolean evaluate(int y, int x, int cur) {
        if (y < 0 || x < 0 || y >= board.length || x >= board[0].length || cur >= word.length()) {
            return false;
        }

        if (visited[y][x] || board[y][x] != word.charAt(cur)) {
            return false;
        }

        visited[y][x] = true;

        if (board[y][x] == word.charAt(cur) && cur == word.length() - 1) {
            visited[y][x] = false;
            return true;
        }

        boolean result = evaluate(y, x + 1, cur + 1) || evaluate(y + 1, x, cur + 1) || evaluate(y, x - 1, cur + 1) || evaluate(y - 1, x, cur + 1);

        visited[y][x] = false;

        return result;
    }
    
    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word;
        this.visited = new boolean[board.length][board[0].length];

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                if (evaluate(y, x, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

}
