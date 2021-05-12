package com.dongho.dev.coding_test.leetcode.binary_search._35_SearchInsertPosition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class SolutionTest {
    
    @Test
    public void test() {
        // given
        int[] nums = {1, 3, 5, 6};
        Solution solution = new Solution();

        // when
        int result1 = solution.searchInsert(nums, 5);
        int result2 = solution.searchInsert(nums, 2);
        int result3 = solution.searchInsert(nums, 7);
        int result4 = solution.searchInsert(nums, 0);
        int result5 = solution.searchInsert(new int[]{1}, 0);

        // then
        assertThat(result1).isEqualTo(2);
        assertThat(result2).isEqualTo(1);
        assertThat(result3).isEqualTo(4);
        assertThat(result4).isEqualTo(0);
        assertThat(result5).isEqualTo(0);

    }

}
