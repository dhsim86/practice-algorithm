package com.dongho.dev.coding_test.leetcode.tree._1377_FrogPositionAfterTSeconds;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        Assertions.assertThat(0.12).isCloseTo(0.1, Assertions.offset(0.1));
        Assertions.assertThat(0.12).isNotCloseTo(0.1, Assertions.offset(0.01));
        Assertions.assertThat(0.12).isCloseTo(0.11, Assertions.offset(0.01));

        double result1 = new Solution().frogPosition(7, new int[][] {
            {1, 2}, {1, 3}, {1, 7}, {2, 4}, {2, 6}, {3, 5}
        }, 2, 4);
        double result2 = new Solution().frogPosition(7, new int[][] {
            {1, 2}, {1, 3}, {1, 7}, {2, 4}, {2, 6}, {3, 5}
        }, 1, 7);
        double result3 = new Solution().frogPosition(8, new int[][] {
            {2, 1}, {3, 2}, {4, 1}, {5, 1}, {6, 4}, {7, 1}, {8, 7}
        }, 7, 7);
        double result4 = new Solution().frogPosition(7, new int[][] {
            {1, 2}, {1, 3}, {1, 7}, {2, 4}, {2, 6}, {3, 5}
        }, 20, 6);
        double result5 = new Solution().frogPosition(1, new int[][] {
        }, 1, 1);

        // then
        Assertions.assertThat(result1).isCloseTo(0.16666, Assertions.offset(0.00001));
        Assertions.assertThat(result2).isCloseTo(0.33333, Assertions.offset(0.00001));
        Assertions.assertThat(result3).isCloseTo(0.00000, Assertions.offset(0.00001));
        Assertions.assertThat(result4).isCloseTo(0.16667, Assertions.offset(0.00001));
        Assertions.assertThat(result5).isCloseTo(1.00000, Assertions.offset(0.00001));
    }

}
