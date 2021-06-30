package com.dongho.dev.coding_test.leetcode.tree._987_VerticalOrderTraversalOfBinaryTree;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Collectors;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);

        TreeNode root3 = new TreeNode(3);
        root3.left = new TreeNode(1);
        root3.right = new TreeNode(4);
        root3.left.left = new TreeNode(0);
        root3.left.right = new TreeNode(2);
        root3.right.left = new TreeNode(2);

        // when
        List<List<Integer>> result1 = new Solution().verticalTraversal(root1);
        List<List<Integer>> result2 = new Solution().verticalTraversal(root2);
        List<List<Integer>> result3 = new Solution().verticalTraversal(root3);

        // then
        List<Integer> flatten = result1.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
        assertThat(flatten).containsExactly(9, 3, 15, 20, 7);

        flatten = result2.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
        assertThat(flatten).containsExactly(4, 2, 1, 5, 6, 3, 7);

        flatten = result3.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
        assertThat(flatten).containsExactly(0, 1, 3, 2, 2, 4);
    }

}
