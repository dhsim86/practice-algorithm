package com.dongho.dev.coding_test.programmers.level3_test.격자쿼리;

public class Solution {

    private int[] approveQuery(int maxX, int maxY, int curX, int curY, int[] query) {
        int cmd = query[0];
        int delta = query[1];

        switch (cmd) {
        case 0:
            curY = Math.max(0, curY - delta);
            break;
        case 1:
            curY = Math.min(maxY, curY + delta);
            break;
        case 2:
            curX = Math.max(0, curX - delta);
            break;
        case 3:
            curX = Math.min(maxX, curX + delta);
            break;
        }

        return new int[] { curX, curY };
    }

    public long solution(int n, int m, int x, int y, int[][] queries) {
        long answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int curX = i;
                int curY = j;

                for (int[] query : queries) {
                    int result[] = approveQuery(n - 1, m - 1, curX, curY, query);
                
                    curX = result[0];
                    curY = result[1];
                }

                if (curX == x && curY == y) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
