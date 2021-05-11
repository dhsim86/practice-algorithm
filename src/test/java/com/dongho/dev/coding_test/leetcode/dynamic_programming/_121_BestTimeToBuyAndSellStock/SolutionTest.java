package com.dongho.dev.coding_test.leetcode.dynamic_programming._121_BestTimeToBuyAndSellStock;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class SolutionTest {
    
    @Test
    public void test() {
        // given
        int[] input1 = {7, 1, 5, 3, 6, 4};
        int[] input2 = {7, 6, 4, 3, 1};
        Solution solution = new Solution();

        // when
        int result1 = solution.maxProfit(input1);
        int result2 = solution.maxProfit(input2);

        // then
        assertThat(result1).isEqualTo(5);
        assertThat(result2).isEqualTo(0);
    }

}
