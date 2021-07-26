package com.dongho.dev.coding_test.leetcode.dynamic_programming._416_PartitionEqualSubsetSum;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        // when
        boolean result1 = new Solution().canPartition(new int[]{1, 5, 11, 5});
        boolean result2 = new Solution().canPartition(new int[]{1, 2, 3, 5});
        boolean result3 = new Solution().canPartition(new int[]{2, 2, 1, 1});
        boolean result4 = new Solution().canPartition(new int[]{14, 9, 8, 4, 3, 2});

        // then
        assertThat(result1).isTrue();
        assertThat(result2).isFalse();
        assertThat(result3).isTrue();
        assertThat(result4).isTrue();
    }

}
