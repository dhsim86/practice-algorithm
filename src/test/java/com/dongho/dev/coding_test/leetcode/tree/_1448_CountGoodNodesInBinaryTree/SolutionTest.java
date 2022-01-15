package com.dongho.dev.coding_test.leetcode.tree._1448_CountGoodNodesInBinaryTree;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(1);
        root1.left.left = new TreeNode(3);
        root1.right = new TreeNode(4);
        root1.right.left = new TreeNode(1);
        root1.right.right = new TreeNode(5);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(2);

        // when
        int result1 = new Solution().goodNodes(root1);
        int result2 = new Solution().goodNodes(root2);

        // then
        Assertions.assertThat(result1).isEqualTo(4);
        Assertions.assertThat(result2).isEqualTo(3);
    }

}
