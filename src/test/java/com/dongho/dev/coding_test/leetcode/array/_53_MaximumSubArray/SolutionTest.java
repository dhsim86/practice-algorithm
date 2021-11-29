package com.dongho.dev.coding_test.leetcode.array._53_MaximumSubArray;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums2 = {1};
        int[] nums3 = {5, 4, -1, 7, 8};
        int[] nums4 = {-1, -2};

        Solution solution = new Solution();

        // when
        int result1 = solution.maxSubArray(nums1);
        int result2 = solution.maxSubArray(nums2);
        int result3 = solution.maxSubArray(nums3);
        int result4 = solution.maxSubArray(nums4);

        // then
        assertThat(result1).isEqualTo(6);
        assertThat(result2).isEqualTo(1);
        assertThat(result3).isEqualTo(23);
        assertThat(result4).isEqualTo(-1);
    }

}
