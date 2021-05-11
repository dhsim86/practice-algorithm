package com.dongho.dev.coding_test.leetcode.dynamic_programming._121_BestTimeToBuyAndSellStock;

public class Solution {

    public int maxProfit(int[] prices) {
        int min = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - prices[min]);

            if (prices[i] < prices[min]) {
                min = i;
            }
        }
        return profit;
    }

}
