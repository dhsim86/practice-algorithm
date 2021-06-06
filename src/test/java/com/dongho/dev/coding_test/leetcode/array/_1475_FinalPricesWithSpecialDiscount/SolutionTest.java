package com.dongho.dev.coding_test.leetcode.array._1475_FinalPricesWithSpecialDiscount;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int[] result0 = new Solution().finalPrices(new int[] {8, 4, 6, 2, 3});
        int[] result1 = new Solution().finalPrices(new int[] {10, 1, 1, 6});

        // then
        assertThat(result0).containsExactly(4, 2, 4, 2, 3);
        assertThat(result1).containsExactly(9, 0, 1, 6);
    }

}
