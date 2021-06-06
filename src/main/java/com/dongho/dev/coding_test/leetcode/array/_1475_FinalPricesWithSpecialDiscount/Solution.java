package com.dongho.dev.coding_test.leetcode.array._1475_FinalPricesWithSpecialDiscount;

public class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int discount = 0;

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= price) {
                    discount = prices[j];
                    break;
                }
            }
            result[i] = price - discount;
        }

        return result;
    }
}
