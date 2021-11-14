package com.dongho.dev.coding_test.leetcode.array._1475_FinalPricesWithSpecialDiscount;

public class Solution {

    private int getDiscount(int[] prices, int index) {
        int discount = 0;

        for (int i = prices.length - 1; i > index; i--) {
            if (prices[index] >= prices[i]) {
                discount = prices[i];
            }
        }

        return discount;
    }

    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length; i++) {
            prices[i] = prices[i] - getDiscount(prices, i);
        }
        return prices;
    }

}
