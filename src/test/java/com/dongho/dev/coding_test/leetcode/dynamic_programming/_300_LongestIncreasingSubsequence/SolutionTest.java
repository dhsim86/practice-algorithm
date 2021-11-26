package com.dongho.dev.coding_test.leetcode.dynamic_programming._300_LongestIncreasingSubsequence;

import com.dongho.dev.coding_test.leetcode.binary_search._300_LongestIncreasingSubsequence.Solution;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().lengthOfLIS(new int[] {
            10, 9, 2, 5, 3, 7, 101, 18
        });
        int result2 = new Solution().lengthOfLIS(new int[] {
            0, 1, 0, 3, 2, 3
        });
        int result3 = new Solution().lengthOfLIS(new int[] {
            7, 7, 7, 7, 7, 7, 7
        });
        int result4 = new Solution().lengthOfLIS(new int[] {
            1, 3, 6, 7, 9, 4, 10, 5, 6
        });

        // then
        Assertions.assertThat(result1).isEqualTo(4);
        Assertions.assertThat(result2).isEqualTo(4);
        Assertions.assertThat(result3).isEqualTo(1);
        Assertions.assertThat(result4).isEqualTo(6);
    }

}
