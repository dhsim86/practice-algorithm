package com.dongho.dev.coding_test.leetcode.array._1798_MaximumNumberOfConsecutiveValuesYouCanMake;

import java.util.Arrays;

public class Solution {
    
    public int getMaximumConsecutive(int[] coins) {
        coins = Arrays.stream(coins)
            .sorted()
            .toArray();
        
        // refs: https://leetcode.com/problems/maximum-number-of-consecutive-values-you-can-make/discuss/1432729
        int curMax = 0;

        // [1 1 3 4 10]

        // [1]
        // [2]
        // [5]
        // [9]
        // [19]

        for (int i = 0; i < coins.length; i++) {
            int coin = coins[i];

            if (coin <= curMax + 1) {
                curMax += coin;
            } else {
                break;
            }
        }

        return curMax + 1;
    }

}
