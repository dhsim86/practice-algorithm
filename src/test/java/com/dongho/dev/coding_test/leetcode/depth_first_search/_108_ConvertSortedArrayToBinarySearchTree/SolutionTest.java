package com.dongho.dev.coding_test.leetcode.depth_first_search._108_ConvertSortedArrayToBinarySearchTree;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        int[] input1 = {-10, -3, 0, 5, 9};

        // when
        TreeNode result1 = new Solution().sortedArrayToBST(input1);

        // then
        assertThat(result1.val).isEqualTo(0);
        assertThat(result1.left.val).isIn(-3, -10);
        assertThat(result1.right.val).isIn(5, 9);
    }

}
