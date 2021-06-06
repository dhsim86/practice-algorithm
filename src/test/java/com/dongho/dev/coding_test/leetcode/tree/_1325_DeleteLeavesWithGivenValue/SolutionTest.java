package com.dongho.dev.coding_test.leetcode.tree._1325_DeleteLeavesWithGivenValue;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given
        TreeNode input1 = new TreeNode(1);
        input1.left = new TreeNode(2);
        input1.right = new TreeNode(3);
        
        input1.left.left = new TreeNode(2);
        input1.right.left = new TreeNode(2);
        input1.right.right = new TreeNode(4);

        // when
        TreeNode result1 = new Solution().postfixTraverseAndDelete(input1, 2);

        // then
        assertThat(result1.val).isEqualTo(1);
        assertThat(result1.left).isNull();
        assertThat(result1.right.val).isEqualTo(3);
        assertThat(result1.right.left).isNull();
        assertThat(result1.right.right.val).isEqualTo(4);
    }
    
}
