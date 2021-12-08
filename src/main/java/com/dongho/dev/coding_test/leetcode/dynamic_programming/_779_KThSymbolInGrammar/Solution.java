package com.dongho.dev.coding_test.leetcode.dynamic_programming._779_KThSymbolInGrammar;

public class Solution {
    
    /*
    dp[0] = 0
    dp[1] = dp[n - 1] + 1   // 01
    dp[2] = dp[n - 1] + 

    => + 연산자 => String.concat

    dp[0] = dp[0] + !dp[0]          => 0 1
    dp[1] = dp[n - 1] + !dp[n - 1]  => 01 10

    0                               n => 1      val => 0
    0 => 0 1                        n => 2      val => 1
    01 => 01 10                     n => 3      val => 6
    0110 => 0110 1001               n => 4      val => 105
    01101001 => 01101001  10010110  n => 5

    */
    private String[] dp = new String[31];

    private String getReverseBinaryString(String s) {
        StringBuilder builder = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c == '0') {
                builder.append('1');
            } else {
                builder.append('0');
            }
        }

        return builder.toString();
    }

    private String getKthBit(int n) {
        if (dp[n] != null) {
            return dp[n];
        }

        if (n == 1) {
            return "0";
        }

        String val = getKthBit(n - 1);
        dp[n] = val + getReverseBinaryString(val);

        return dp[n];
    }

    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }

        return getKthBit(n).charAt(k - 1) - '0';
    }

}
