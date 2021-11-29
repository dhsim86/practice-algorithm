package com.dongho.dev.coding_test.leetcode.dynamic_programming._639_DecodeWays2;

public class Solution {
    
    private String s;

    // dp[start][end] = count + dp[end][end + 1], dp[start][end + 1];
    // end == s.length() ? => 1
    // substring(start, end) is ivalid ? => 0
    private int[][] dp;

    private int getCount(int start, int end) {
        if (start == end || end - start > 2) {
            return 0;
        }

        try {
            int val = Integer.parseInt(s.substring(start, end));

            if (val < 1 || val > 26) {
                return 0;
            }

            return 1;
        } catch (Exception e) {
            String sub = s.substring(start, end);

            // *
            if (sub.length() == 1 && sub.charAt(0) == '*') {
                return 9;
            }

            // **
            if (sub.length() == 2 && sub.charAt(0) == '*' && sub.charAt(1) == '*') {
                // * 한개씩 => 81 (9 * 9)
                // ** 두개 => 9 (11 ~ 19) + 6 (21 + 26)

                // 87 (96 - 9)
                return 87;
            }

            // *n
            if (s.charAt(0) == '*') {
                return 2;
            }

            // n*
            if (s.charAt(1) == '*') {
                int prefix = Integer.parseInt(sub.substring(0, 1));

                if (prefix == 1) {
                    return 9;
                } 

                if (prefix == 2) {
                    return 6;
                }
            }
        }

        return 0;
    }

    private boolean isValid(int start, int end) {
        return getCount(start, end) > 0;
    }

    private int getWay(int start, int end) {
        if (dp[start][end] > 0) {
            return 0;
        }

        if (isValid(start, end)) {
            if (end == s.length()) {
                dp[start][end] = getCount(start, end);
            } else {
                dp[start][end] = getWay(end, end + 1) + getWay(start, end + 1);
            }

            return dp[start][end];
        }

        return 0;
    }

    public int numDecodings(String s) {
        this.s = s;
        this.dp = new int[s.length() + 1][s.length() + 1];

        return getWay(0, 1);
    }

}
