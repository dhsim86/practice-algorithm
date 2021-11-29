package com.dongho.dev.coding_test.leetcode.dynamic_programming._983_MinimumCostForTickets;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().mincostTickets(
            new int[] {1, 4, 6, 7, 8, 20}, new int[] {2, 7, 15});
        int result2 = new Solution().mincostTickets(
            new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31}, new int[] {2, 7, 15});

        // then
        Assertions.assertThat(result1).isEqualTo(11);
        Assertions.assertThat(result2).isEqualTo(17);
    }
}
