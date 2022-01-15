package com.dongho.dev.coding_test.leetcode.others._1648_SellDininishingValuedColoredBalls;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().maxProfit(new int[] {2, 5}, 4);
        int result2 = new Solution().maxProfit(new int[] {3, 5}, 6);

        // then
        Assertions.assertThat(result1).isEqualTo(14);
        Assertions.assertThat(result2).isEqualTo(19);
    }

}
