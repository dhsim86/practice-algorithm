package com.dongho.dev.coding_test.leetcode.tree._617_MergeTwoBinaryTrees;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.left.left = new TreeNode(5);
        root1.right = new TreeNode(2);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.left.right = new TreeNode(4);
        root2.right = new TreeNode(3);
        root2.right.right = new TreeNode(7);

        // when
        TreeNode result = new Solution().mergeTrees(root1, root2);

        // then
        assertThat(result.val).isEqualTo(3);
        assertThat(result.left.val).isEqualTo(4);
        assertThat(result.left.left.val).isEqualTo(5);
        assertThat(result.left.right.val).isEqualTo(4);
        assertThat(result.right.val).isEqualTo(5);
        assertThat(result.right.right.val).isEqualTo(7);
    }
}
