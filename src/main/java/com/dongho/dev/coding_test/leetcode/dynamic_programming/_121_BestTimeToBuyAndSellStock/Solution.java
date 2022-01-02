package com.dongho.dev.coding_test.leetcode.dynamic_programming._121_BestTimeToBuyAndSellStock;

public class Solution {

    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int buy = 0;

        for (int i = 0; i < prices.length; i++) {
            max = Math.max(max, prices[i] - prices[buy]);
            
            if (prices[i] < prices[buy]) {
                buy = i;
            }
        }

        return max;
    }

}
