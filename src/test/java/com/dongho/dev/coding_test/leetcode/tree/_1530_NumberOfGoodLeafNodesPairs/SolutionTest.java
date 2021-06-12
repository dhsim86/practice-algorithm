package com.dongho.dev.coding_test.leetcode.tree._1530_NumberOfGoodLeafNodesPairs;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.left.right = new TreeNode(4);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);

        // when
        int result1 = new Solution().countPairs(root1, 3);
        int result2 = new Solution().countPairs(root2, 3);

        // then
        assertThat(result1).isEqualTo(1);
        assertThat(result2).isEqualTo(2);
    }
    
}
