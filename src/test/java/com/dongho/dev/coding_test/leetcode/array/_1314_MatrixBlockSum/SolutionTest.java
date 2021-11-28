package com.dongho.dev.coding_test.leetcode.array._1314_MatrixBlockSum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int[][] result1 = new Solution().matrixBlockSum(new int[][] {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        }, 1);
        int[][] result2 = new Solution().matrixBlockSum(new int[][] {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        }, 2);

        // then
        Assertions.assertThat(result1[0]).containsExactly(12, 21, 16);
        Assertions.assertThat(result1[1]).containsExactly(27, 45, 33);
        Assertions.assertThat(result1[2]).containsExactly(24, 39, 28);

        Assertions.assertThat(result2[0]).containsExactly(45, 45, 45);
        Assertions.assertThat(result2[1]).containsExactly(45, 45, 45);
        Assertions.assertThat(result2[2]).containsExactly(45, 45, 45);
    }

}

