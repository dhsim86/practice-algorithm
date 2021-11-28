package com.dongho.dev.coding_test.leetcode.array._1769_MinimumNumberOfOperationsToMoveAllBallsToEachBox;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int[] result1 = new Solution().minOperations("110");
        int[] result2 = new Solution().minOperations("001011");

        // then
        Assertions.assertThat(result1).containsExactly(1, 1, 3);
        Assertions.assertThat(result2).containsExactly(11, 8, 5, 4, 3, 4);
    }

}
