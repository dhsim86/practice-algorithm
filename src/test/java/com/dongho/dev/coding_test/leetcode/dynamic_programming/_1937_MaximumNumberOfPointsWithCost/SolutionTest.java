package com.dongho.dev.coding_test.leetcode.dynamic_programming._1937_MaximumNumberOfPointsWithCost;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        long result1 = new Solution().maxPoints(new int[][] {
            {1, 2, 3},
            {1, 5, 1},
            {3, 1, 1}
        });
        long result2 = new Solution().maxPoints(new int[][] {
            {1, 5},
            {2, 3},
            {4, 2}
        });

        // then
        assertThat(result1).isEqualTo(9);
        assertThat(result2).isEqualTo(11);
    }
    
}
