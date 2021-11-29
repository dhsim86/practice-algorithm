package com.dongho.dev.coding_test.leetcode.dynamic_programming._91_DecodeWays;

public class Solution {

    private String s;

    // dp[start][end] = dp[start + 1][end + 1] + dp[start][end + 1];
    // s(start, end) is not valid: 0
    // if end is s.length: 1

    private int[][] dp;

    private boolean isValid(int start, int end) {
        if (start == end) {
            return false;
        }

        Integer value = Integer.parseInt(s.substring(start, end));

        if (value < 1 || value > 26) {
            return false;
        }
        return true;
    }

    private int getWay(int start, int end) {
        if (dp[start][end] > 0) {
            return dp[start][end];
        }

        if (isValid(start, end)) {
            if (end == s.length()) {
                return 1;
            } else {
                // must (end, end + 1), not (start + 1, end + 1) for 2 digit.
                dp[start][end] = getWay(end, end + 1) + getWay(start, end + 1);
                return dp[start][end];
            }
        }

        return 0;
    }

    public int numDecodings(String s) {
        this.s = s;
        this.dp = new int[s.length() + 1][s.length() + 1];

        return getWay(0, 1);
    }

}
