package com.dongho.dev.coding_test.leetcode.dynamic_programming._70_climbling_stairs;

public class Solution {
    
    private int[] memo = null;

    public int climbStairs(int n) {
        if (memo == null) {
            memo = new int[n + 1];
        }

        if (n <= 2) {
            return n;
        }

        if (memo[n] != 0) {
            return memo[n];
        }
        // f(1) == 1, f(2) == 2
        // f(n) == f(n - 1) + f(n - 2)
        memo[n] = climbStairs(n - 1) + climbStairs(n - 2);
        return memo[n];
    }

}
