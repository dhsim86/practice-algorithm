package com.dongho.dev.coding_test.leetcode.greedy._122_BestTimeToBuyAndSellStock2;

public class Solution {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 0;
        boolean bought = false;

        for (int i = 0; i < prices.length - 1; i++) {
            if (bought && prices[i + 1] >= prices[i]) {
                continue;
            }

            if (!bought && prices[i + 1] <= prices[i]) {
                continue;
            }

            if (bought) {
                profit += prices[i] - prices[buy];
                bought = false;
                continue;
            }

            if (!bought) {
                buy = i;
                bought = true;
            }
        }
        if (bought) {
            profit += prices[prices.length - 1] - prices[buy];
        }

        return profit;
    }

}
