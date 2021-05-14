package com.dongho.dev.coding_test.leetcode.depth_first_search._101_SymmeticTree;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        TreeNode input1 = new TreeNode(1);
        input1.left = new TreeNode(2);
        input1.left.left = new TreeNode(3);
        input1.left.right = new TreeNode(4);

        input1.right = new TreeNode(2);
        input1.right.left = new TreeNode(4);
        input1.right.right = new TreeNode(3);

        TreeNode input2 = new TreeNode(1);
        input2.left = new TreeNode(2);
        input2.left.right = new TreeNode(3);
        
        input2.right = new TreeNode(2);
        input2.right.right = new TreeNode(3);

        // when
        boolean result1 = new Solution().isSymmetric(input1);
        boolean result2 = new Solution().isSymmetric(input2);

        // then
        assertThat(result1).isTrue();
        assertThat(result2).isFalse();
    }

}
