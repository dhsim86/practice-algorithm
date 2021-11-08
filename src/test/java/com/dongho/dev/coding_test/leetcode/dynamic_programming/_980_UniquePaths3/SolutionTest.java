package com.dongho.dev.coding_test.leetcode.dynamic_programming._980_UniquePaths3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result = new Solution().uniquePathsIII(new int[][] {
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 2, -1}
        });

        // then
        assertThat(result).isEqualTo(2);
    }
    
}
