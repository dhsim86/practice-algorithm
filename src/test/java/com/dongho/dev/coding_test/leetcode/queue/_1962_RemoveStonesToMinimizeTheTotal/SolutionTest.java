package com.dongho.dev.coding_test.leetcode.queue._1962_RemoveStonesToMinimizeTheTotal;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().minStoneSum(new int[] {5, 4, 9}, 2);
        int result2 = new Solution().minStoneSum(new int[] {4, 3, 6, 7}, 3);

        // then
        Assertions.assertThat(result1).isEqualTo(12);
        Assertions.assertThat(result2).isEqualTo(12);
    }

}
