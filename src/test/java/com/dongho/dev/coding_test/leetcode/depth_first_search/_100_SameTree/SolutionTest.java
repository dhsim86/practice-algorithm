package com.dongho.dev.coding_test.leetcode.depth_first_search._100_SameTree;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        TreeNode input1 = new TreeNode(1);
        input1.left = new TreeNode(2);
        input1.right = new TreeNode(3);

        TreeNode input2 = new TreeNode(1);
        input2.left = new TreeNode(2);
        input2.right = new TreeNode(3);

        TreeNode input3 = new TreeNode(1);
        input3.left = new TreeNode(2);

        TreeNode input4 = new TreeNode(1);
        input4.left = null;
        input4.right = new TreeNode(2);

        TreeNode input5 = new TreeNode(1);
        input5.left = new TreeNode(2);
        input5.right = new TreeNode(1);

        TreeNode input6 = new TreeNode(1);
        input6.left = new TreeNode(1);
        input6.right = new TreeNode(2);

        // when
        boolean result1 = new Solution().isSameTree(input1, input2);
        boolean result2 = new Solution().isSameTree(input3, input4);
        boolean result3 = new Solution().isSameTree(input5, input6);

        // then
        assertThat(result1).isTrue();
        assertThat(result2).isFalse();
        assertThat(result3).isFalse();
    }

}
