package com.dongho.dev.coding_test.leetcode.tree._951_FlipEquivalentBinaryTrees;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.right.left = new TreeNode(6);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(8);

        TreeNode root2 = new TreeNode(1);
        root2.right = new TreeNode(2);
        root2.left = new TreeNode(3);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(5);
        root2.left.right = new TreeNode(6);
        root2.right.right.right = new TreeNode(7);
        root2.right.right.left = new TreeNode(8);

        TreeNode root3 = null;
        TreeNode root4 = new TreeNode(1);

        // when
        boolean result1 = new Solution().flipEquiv(root1, root2);
        boolean result2 = new Solution().flipEquiv(root3, root4);

        // then
        assertThat(result1).isTrue();
        assertThat(result2).isFalse();
    }
    
}
