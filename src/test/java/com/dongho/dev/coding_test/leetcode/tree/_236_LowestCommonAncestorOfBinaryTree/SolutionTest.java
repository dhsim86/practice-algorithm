package com.dongho.dev.coding_test.leetcode.tree._236_LowestCommonAncestorOfBinaryTree;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);

        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);

        root1.right.left = new TreeNode(0);
        root1.right.right = new TreeNode(8);

        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);

        // when
        TreeNode result1 = new Solution().lowestCommonAncestor(root1, new TreeNode(5), new TreeNode(1));
        TreeNode result2 = new Solution().lowestCommonAncestor(root1, new TreeNode(5), new TreeNode(4));
        TreeNode result3 = new Solution().lowestCommonAncestor(root2, new TreeNode(1), new TreeNode(2));
        // then
        assertThat(result1).isNotNull().extracting("val").isEqualTo(3);
        assertThat(result2).isNotNull().extracting("val").isEqualTo(5);
        assertThat(result3).isNotNull().extracting("val").isEqualTo(1);
    }
    
}
