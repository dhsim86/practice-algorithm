package com.dongho.dev.coding_test.leetcode.tree._1372_LongestZigZagPathInBinaryTree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        TreeNode node1 = new TreeNode(1);
        node1.right = new TreeNode(1);

        node1.right.left = new TreeNode(1);
        node1.right.right = new TreeNode(1);

        node1.right.right.right = new TreeNode(1);
        node1.right.right.left = new TreeNode(1);
        node1.right.right.left.right = new TreeNode(1);
        node1.right.right.left.right.right = new TreeNode(1);
        
        // when
        int result1 = new Solution().longestZigZag(node1);

        // then
        Assertions.assertThat(result1).isEqualTo(3);
    }
    
}
