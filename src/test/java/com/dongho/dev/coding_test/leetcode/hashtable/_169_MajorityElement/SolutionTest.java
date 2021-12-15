package com.dongho.dev.coding_test.leetcode.hashtable._169_MajorityElement;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int[] nums3 = {2, 2, 1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6};
        int[] nums4 = {4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,5,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5,4,5};
        int[] nums5 = {4,5,4,5,4,5,5,5,4,5,4,5,4,5,4,5,4,5,4,5};
        int[] nums6 = {345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345,543,345};
        int[] nums7 = {4,5,4,5,4,5,4,5,4,5,4,5,4,5,4};

        Solution solution = new Solution();

        // when
        int result1 = solution.majorityElement(nums1);
        int result2 = solution.majorityElement(nums2);
        int result3 = solution.majorityElement(nums3);
        int result4 = solution.majorityElement(nums4);
        int result5 = solution.majorityElement(nums5);
        int result6 = solution.majorityElement(nums6);
        int result7 = solution.majorityElement(nums7);

        // then
        
        assertThat(result1).isEqualTo(3);
        assertThat(result2).isEqualTo(2);
        assertThat(result3).isEqualTo(1);
        assertThat(result4).isEqualTo(5);
        assertThat(result5).isEqualTo(5);
        assertThat(result6).isEqualTo(345);
        assertThat(result7).isEqualTo(4);
    }
    
}