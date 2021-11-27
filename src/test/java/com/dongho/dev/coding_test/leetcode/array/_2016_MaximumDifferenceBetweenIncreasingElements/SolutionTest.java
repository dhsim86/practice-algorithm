package com.dongho.dev.coding_test.leetcode.array._2016_MaximumDifferenceBetweenIncreasingElements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().maximumDifference(new int[] {7, 1, 5, 4});
        int result2 = new Solution().maximumDifference(new int[] {9, 4, 3, 2});
        int result3 = new Solution().maximumDifference(new int[] {1, 5, 2, 10});

        // then
        Assertions.assertThat(result1).isEqualTo(4);
        Assertions.assertThat(result2).isEqualTo(-1);
        Assertions.assertThat(result3).isEqualTo(9);
    }

}
