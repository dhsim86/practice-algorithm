package com.dongho.dev.coding_test.leetcode.breadth_firsh_search._111_MinimumDepthOfBinaryTree;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        TreeNode input1 = new TreeNode(3);
        input1.left = new TreeNode(9);
        input1.right = new TreeNode(20);
        input1.right.left = new TreeNode(15);
        input1.right.right = new TreeNode(7);
        
        TreeNode input2 = new TreeNode(2);
        input2.right = new TreeNode(3);
        input2.right.right = new TreeNode(4);
        input2.right.right.right = new TreeNode(5);
        input2.right.right.right.right = new TreeNode(6);

        TreeNode input3 = new TreeNode(1);
        input3.left = new TreeNode(2);
        input3.right = new TreeNode(3);
        input3.left.left = new TreeNode(4);
        input3.left.right = new TreeNode(5);

        // when
        int result1 = new Solution().minDepth(input1);
        int result2 = new Solution().minDepth(input2);
        int result3 = new Solution().minDepth(input3);

        // then
        assertThat(result1).isEqualTo(2);
        assertThat(result2).isEqualTo(5);
        assertThat(result3).isEqualTo(2);
    }

}
