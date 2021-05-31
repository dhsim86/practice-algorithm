package com.dongho.dev.coding_test.leetcode.dynamic_programming._746_MinCostClimbingStairs;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class SolutionTest {

    @Test
    public void test() {
        // given
        Solution solution = new Solution();

        // when
        int result1 = solution.minCostClimbingStairs(new int[]{10, 15, 20});
        int result2 = solution.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});

        // then
        assertThat(result1).isEqualTo(15);
        assertThat(result2).isEqualTo(6);
    }
    
}
