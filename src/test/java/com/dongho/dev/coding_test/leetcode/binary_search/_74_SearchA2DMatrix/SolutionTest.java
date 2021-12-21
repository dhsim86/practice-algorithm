package com.dongho.dev.coding_test.leetcode.binary_search._74_SearchA2DMatrix;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        boolean result1 = new Solution().searchMatrix(new int[][] {
            {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}
        }, 3);
        boolean result2 = new Solution().searchMatrix(new int[][] {
            {1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}
        }, 13);
        boolean result3 = new Solution().searchMatrix(new int[][] {
            {1}
        }, 2);

        // then
        Assertions.assertThat(result1).isTrue();
        Assertions.assertThat(result2).isFalse();
        Assertions.assertThat(result3).isFalse();
    }
    
}
