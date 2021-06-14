package com.dongho.dev.coding_test.leetcode.tree._124_BinaryTreeMaximumPathSum;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(-10);
        root2.left = new TreeNode(9);
        root2.right = new TreeNode(20);
        root2.right.left = new TreeNode(15);
        root2.right.right = new TreeNode(7);

        TreeNode root3 = new TreeNode(-2);
        root3.left = new TreeNode(-3);
        root3.right = new TreeNode(-1);
        
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(-2);
        root4.right = new TreeNode(-3);

        root4.left.left = new TreeNode(1);
        root4.left.right = new TreeNode(3);

        root4.right.left = new TreeNode(-2);

        root4.left.left.left = new TreeNode(-1);

        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.left.left = new TreeNode(3);
        root5.left.left.left = new TreeNode(4);
        root5.left.left.left.left = new TreeNode(5);

        // when
        int result1 = new Solution().maxPathSum(root1);
        int result2 = new Solution().maxPathSum(root2);
        int result3 = new Solution().maxPathSum(root3);
        int result4 = new Solution().maxPathSum(root4);
        int result5 = new Solution().maxPathSum(root5);

        //then
        assertThat(result1).isEqualTo(6);
        assertThat(result2).isEqualTo(42);
        assertThat(result3).isEqualTo(-1);
        assertThat(result4).isEqualTo(3);
        assertThat(result5).isEqualTo(15);
    }

}
