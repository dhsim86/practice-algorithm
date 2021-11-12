package com.dongho.dev.coding_test.leetcode.tree._404_SumOfLeftLeaves;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(0);
        root2.left = new TreeNode(-4);
        root2.right = new TreeNode(-3);

        root2.left.right = new TreeNode(-1);
        root2.right.left = new TreeNode(8);

        root2.left.right.right = new TreeNode(3);
        root2.right.left.right = new TreeNode(-9);

        root2.left.right.right.left = new TreeNode(-2);
        root2.right.left.right.left = new TreeNode(4);

        TreeNode root3 = new TreeNode(1);
        

        // when
        int result1 = new Solution().sumOfLeftLeaves(root1);
        int result2 = new Solution().sumOfLeftLeaves(root2);
        int result3 = new Solution().sumOfLeftLeaves(root3);

        // then
        assertThat(result1).isEqualTo(24);
        assertThat(result2).isEqualTo(2);
        assertThat(result3).isEqualTo(0);
    }

}
