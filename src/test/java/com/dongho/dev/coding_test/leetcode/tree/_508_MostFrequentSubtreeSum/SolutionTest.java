package com.dongho.dev.coding_test.leetcode.tree._508_MostFrequentSubtreeSum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        //given
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(-3);

        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(-5);

        // when
        int[] result1 = new Solution().findFrequentTreeSum(root1);
        int[] result2 = new Solution().findFrequentTreeSum(root2);

        // then
        Assertions.assertThat(result1).containsExactly(2, -3, 4);
        Assertions.assertThat(result2).containsExactly(2);
    }

}
