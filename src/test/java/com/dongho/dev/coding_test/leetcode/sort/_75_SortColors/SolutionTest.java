package com.dongho.dev.coding_test.leetcode.sort._75_SortColors;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        int[] nums1 = new int[] {2, 0, 2, 1, 1, 0};
        int[] nums2 = new int[] {2, 0, 1};
        int[] nums3 = new int[] {0};
        int[] nums4 = new int[] {1};

        // when
        new Solution().sortColors(nums1);
        new Solution().sortColors(nums2);
        new Solution().sortColors(nums3);
        new Solution().sortColors(nums4);
        
        // then
        Assertions.assertThat(nums1).containsExactly(0, 0, 1, 1, 2, 2);
        Assertions.assertThat(nums2).containsExactly(0, 1, 2);
        Assertions.assertThat(nums3).containsExactly(0);
        Assertions.assertThat(nums4).containsExactly(1);
    }

}
