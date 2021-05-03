package com.dongho.dev.coding_test.leetcode.greedy._122_BestTimeToBuyAndSellStock2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {1, 2, 3, 4, 5};
        int[] prices3 = {7, 6, 4, 3, 1};
        Solution solution = new Solution();

        // when
        int profit1 = solution.maxProfit(prices1);
        int profit2 = solution.maxProfit(prices2);
        int profit3 = solution.maxProfit(prices3);

        // then
        assertThat(profit1).isEqualTo(7);
        assertThat(profit2).isEqualTo(4);
        assertThat(profit3).isEqualTo(0);
    }
    
}
