package com.dongho.dev.coding_test.leetcode.sliding_window._122_BestTimeToBuyAndSellStock3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4});
        int result2 = new Solution().maxProfit(new int[]{1, 2, 3, 4, 5});
        int result3 = new Solution().maxProfit(new int[]{7, 6, 4, 3, 1});
        int result4 = new Solution().maxProfit(new int[]{1});
        int result5 = new Solution().maxProfit(new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0});
        // 3, 5, 7

        // then
        assertThat(result1).isEqualTo(6);
        assertThat(result2).isEqualTo(4);
        assertThat(result3).isEqualTo(0);
        assertThat(result4).isEqualTo(0);
        assertThat(result5).isEqualTo(13);
    }
    
}
