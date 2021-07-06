package com.dongho.dev.coding_test.leetcode.tree._965_UnivaluedBinaryTree;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(1);
        root1.right.right = new TreeNode(1);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(5);
        root2.left.right = new TreeNode(2);

        // when
        boolean result1 = new Solution().isUnivalTree(root1);
        boolean result2 = new Solution().isUnivalTree(root2);

        // then
        assertThat(result1).isTrue();
        assertThat(result2).isFalse();
    }
}
