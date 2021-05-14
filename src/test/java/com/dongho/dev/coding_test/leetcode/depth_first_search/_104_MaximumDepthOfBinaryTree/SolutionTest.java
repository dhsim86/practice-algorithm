package com.dongho.dev.coding_test.leetcode.depth_first_search._104_MaximumDepthOfBinaryTree;

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

        TreeNode input2 = new TreeNode(1);
        input2.right = new TreeNode(2);

        TreeNode input3 = null;
        TreeNode input4 = new TreeNode(0);

        // when
        int result1 = new Solution().maxDepth(input1);
        int result2 = new Solution().maxDepth(input2);
        int result3 = new Solution().maxDepth(input3);
        int result4 = new Solution().maxDepth(input4);

        // then
        assertThat(result1).isEqualTo(3);
        assertThat(result2).isEqualTo(2);
        assertThat(result3).isEqualTo(0);
        assertThat(result4).isEqualTo(1);
    }
    
}
