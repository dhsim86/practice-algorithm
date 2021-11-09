package com.dongho.dev.coding_test.leetcode.binary_search._109_ConvertSortedListToBinarySearchTree;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        TreeNode root1 = new Solution().sortedListToBST(null);
        TreeNode root2 = new Solution().sortedListToBST(new ListNode(0));
        TreeNode root3 = new Solution().sortedListToBST(new ListNode(1, new ListNode(3)));

        // then
        assertThat(root1).isNull();
        assertThat(root2.val).isZero();
        assertThat(root2.left).isNull();
        assertThat(root2.right).isNull();

        assertThat(root3.val).isEqualTo(3);
        assertThat(root3.left.val).isEqualTo(1);
        assertThat(root3.right).isNull();
    }

}
