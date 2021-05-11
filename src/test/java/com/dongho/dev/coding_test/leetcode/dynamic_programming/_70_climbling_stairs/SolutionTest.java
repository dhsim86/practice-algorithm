package com.dongho.dev.coding_test.leetcode.dynamic_programming._70_climbling_stairs;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given
        // when
        int result2 = new Solution().climbStairs(2);
        int result3 = new Solution().climbStairs(3);
        int result4 = new Solution().climbStairs(4);

        // then
        assertThat(result2).isEqualTo(2);
        assertThat(result3).isEqualTo(3);
        assertThat(result4).isEqualTo(5);
    }
    
}
