package com.dongho.dev.coding_test.leetcode.dynamic_programming._64_MinimumPathSum;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result0 = new Solution().minPathSum(new int[][] {
            {1, 3, 1}, {1, 5, 1}, {4, 2, 1}
        });
        int result1 = new Solution().minPathSum(new int[][] {
            {1, 2, 3}, {4, 5, 6}
        });

        // then
        assertThat(result0).isEqualTo(7);
        assertThat(result1).isEqualTo(12);
    }
    
}
