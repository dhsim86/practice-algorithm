package com.dongho.dev.coding_test.leetcode.dynamic_programming._1301_NumberOfPathsWithMaxScore;

import java.util.List;

public class Solution {

    private char[][] b;
    private int max;
    private int count;

    private int getValue(int curX, int curY) {
        if (b[curX][curY] == 'X') {
            return Short.MIN_VALUE;
        }

        if (b[curX][curY] == 'S' || (b[curX][curY] == 'E')) {
            return 0;
        }

        return b[curX][curY] - '0';
    }

    private void constructBoard(List<String> board) {
        b = new char[board.size()][board.get(0).length()];

        for (int i = 0; i < board.size(); i++) {
            String line = board.get(i);

            for (int j = 0; j < line.length(); j++) {
                b[i][j] = line.charAt(j);
            }
        }
    }

    private int walkBoard(int curX, int curY) {
        if (curX < 0 || curY < 0) {
            return Short.MIN_VALUE;
        }

        if (b[curX][curY] == 'E' || (b[curX][curY] == 'X')) {
            return getValue(curX, curY);
        }

        int val1 = walkBoard(curX - 1, curY) + getValue(curX, curY);
        int val2 = walkBoard(curX, curY - 1) + getValue(curX, curY);
        int val3 = walkBoard(curX - 1, curY - 1) +  getValue(curX, curY);

        int val = Math.max(Math.max(val1, val2), val3);

        if (curX == b.length - 1 && curY == b.length - 1) {
            int[] values = new int[] {val1, val2, val3};

            int max = 0;
            int count = 0;

            for (int i = 0; i < values.length; i++) {
                if (max < values[i]) {
                    max = values[i];
                    count = 1;
                } else if (max == values[i]) {
                    count++;
                }
            }

            this.max = max;
            this.count = count;
        }

        return val;
    }

    public int[] pathsWithMaxScore(List<String> board) {
        constructBoard(board);
        walkBoard(b.length - 1, b.length - 1);
        return new int[]{max, count};
    }

}
