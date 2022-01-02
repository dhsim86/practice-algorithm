package com.dongho.dev.coding_test.leetcode.two_pointers._122_BestTimeToBuyAndSellStock2;

public class Solution {

    public int maxProfit(int[] prices) {
        int start = 0;
        int end = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[end] < prices[i]) {
                end = i;
            } else if (prices[end] > prices[i]) {
                profit += prices[end] - prices[start];
                end = start = i;
            }

            if (i == prices.length - 1) {
                profit += prices[end] - prices[start];
            }
        }
        
        return profit;
    }

}
