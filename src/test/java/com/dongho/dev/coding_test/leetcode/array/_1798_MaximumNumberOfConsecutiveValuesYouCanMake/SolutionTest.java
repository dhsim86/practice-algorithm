package com.dongho.dev.coding_test.leetcode.array._1798_MaximumNumberOfConsecutiveValuesYouCanMake;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().getMaximumConsecutive(new int[] {
            1, 3,
        });
        int result2 = new Solution().getMaximumConsecutive(new int[] {
            1, 1, 1, 4
        });

        // then
        Assertions.assertThat(result1).isEqualTo(2);
        Assertions.assertThat(result2).isEqualTo(8);
    }
    
}
