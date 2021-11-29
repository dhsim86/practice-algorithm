package com.dongho.dev.coding_test.leetcode.two_pointers._122_BestTimeToBuyAndSellStock3;

public class Solution {

    private int firstProfit = 0;
    private int secondProfit = 0;

    private void updateProfit(int current) {
        secondProfit = Math.max(secondProfit, current);

        if (secondProfit > firstProfit) {
            int temp = firstProfit;
            firstProfit = secondProfit;
            secondProfit = temp;
        }
    }
    
    public int maxProfit(int[] prices) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[end] <= prices[i]) {
                end = i;
            } else if (prices[end] > prices[i]) {
                updateProfit(prices[end] - prices[start]);
                start = end = i;
            }

            if (i == prices.length - 1) {
                updateProfit(prices[end] - prices[start]);
            }
        }

        return firstProfit + secondProfit;
    }

}
