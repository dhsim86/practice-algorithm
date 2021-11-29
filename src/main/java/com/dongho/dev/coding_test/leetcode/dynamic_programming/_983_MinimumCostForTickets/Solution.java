package com.dongho.dev.coding_test.leetcode.dynamic_programming._983_MinimumCostForTickets;

public class Solution {

    // dp
    // dp[i] = min(dp[i - 1] + cost[0], dp[i - 7] + cost[1], dp[i - 30] + cost[2])

    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[366];
        int daysIndex = 0;

        for (int i = 1; i < 366; i++) {
            if (daysIndex == days.length) {
                break;
            }

            if (i != days[daysIndex]) {
                dp[i] = dp[i - 1];
                continue;
            }

            int cost1 = dp[i - 1] + costs[0];
            int cost7 = dp[Math.max(i - 7, 0)] + costs[1];
            int cost30 = dp[Math.max(i - 30, 0)] + costs[2];

            dp[i] = Math.min(cost1, Math.min(cost7, cost30));
            daysIndex++;
        }

        return dp[days[days.length - 1]];
    }

}
