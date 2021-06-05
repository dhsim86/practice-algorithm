package com.dongho.dev.coding_test.leetcode.dynamic_programming._91_DecodeWays;

public class Solution {

    private String numberString;
    private int[][] dp;

    private boolean isValid(int start, int end) {
        if (start == end) {
            return false;
        }

        int number = Integer.parseInt(numberString.substring(start, end));

        if (number < 1 || number > 26) {
            return false;
        }

        return true;
    }

    public int getWays(int start, int end) {
        if (dp[start][end] > 0) {
            return dp[start][end];
        }

        if (isValid(start, end)) {
            if (end >= numberString.length()) {
                dp[start][end] = 1;
            } else {
                dp[start][end] = getWays(start, end + 1) + getWays(end, end + 1);
            }
        } else {
            dp[start][end] = 0;
        }

        return dp[start][end];
    }
    
    public int numDecodings(String s) {
        dp = new int[s.length() + 1][s.length() + 1];
        numberString = s;

        return getWays(0, 1);
    }

}
