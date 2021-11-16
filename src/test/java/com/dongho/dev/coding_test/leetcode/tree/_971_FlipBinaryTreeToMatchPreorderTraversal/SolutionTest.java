package com.dongho.dev.coding_test.leetcode.tree._971_FlipBinaryTreeToMatchPreorderTraversal;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class SolutionTest {

    @Test
    public void test() {
        // given
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        int[] voyage1 = new int[]{ 2, 1 };

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        int[] voyage2 = new int[]{ 1, 3, 2 };

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        int[] voyage3 = new int[]{ 1, 2, 3 };

        TreeNode root4 = new TreeNode(2);
        root4.left = new TreeNode(1);
        root4.right = new TreeNode(4);

        root4.left.left = new TreeNode(5);
        root4.right.left = new TreeNode(3);
        int[] voyage4 = new int[]{ 2, 4, 3, 1, 5 };

        // when
        List<Integer> results1 = new Solution().flipMatchVoyage(root1, voyage1);
        List<Integer> results2 = new Solution().flipMatchVoyage(root2, voyage2);
        List<Integer> results3 = new Solution().flipMatchVoyage(root3, voyage3);
        List<Integer> results4 = new Solution().flipMatchVoyage(root4, voyage4);

        // then
        assertThat(results1).containsExactlyInAnyOrder(-1);
        assertThat(results2).containsExactlyInAnyOrder(1);
        assertThat(results3).isEmpty();
        assertThat(results4).containsExactlyInAnyOrder(2);
    }
    
}
