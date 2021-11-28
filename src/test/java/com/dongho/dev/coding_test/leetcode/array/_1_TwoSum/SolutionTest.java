package com.dongho.dev.coding_test.leetcode.array._1_TwoSum;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given
        int[] nums0 = new int[] {2, 7, 11, 15};
        int[] nums1 = new int[] {3, 2, 4};
        int[] nums2 = new int[] {3, 3};

        Solution solution = new Solution();

        // when
        int[] result0 = solution.twoSum(nums0, 9);
        int[] result1 = solution.twoSum(nums1, 6);
        int[] result2 = solution.twoSum(nums2, 6);

        // then
        assertThat(result0).containsExactly(0, 1);
        assertThat(result1).containsExactly(1, 2);
        assertThat(result2).containsExactly(0, 1);
    }

}
