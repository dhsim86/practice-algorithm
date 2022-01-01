package com.dongho.dev.coding_test.leetcode.dynamic_programming._91_DecodeWays;

public class Solution {

    // dp
    // count => if end
    // dp[0] = dp[1] + dp[2];
    private int[] dp;

    private boolean validate(String str) {
        int digit = Integer.parseInt(str);

        if (digit < 1 || digit > 26) {
            return false;
        }
        return true;
    }

    private int getResult(String s, int start, int end) {
        if (start >= s.length()) {
            return 1;
        }

        if (end > s.length()) {
            return 0;
        }

        if (dp[start] > 0) {
            return dp[start];
        }

        String sub = s.substring(start, end);
        int result = 0;

        if (validate(sub)) {
            result = getResult(s, end, end + 1) + getResult(s, start, end + 1);
        }

        dp[start] = result;
        return dp[start];
    }

    

    public int numDecodings(String s) {
        dp = new int[s.length()];
        return getResult(s, 0, 1);
    }

}
