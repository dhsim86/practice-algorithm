package com.dongho.dev.coding_test.leetcode.tree._102_BinaryTreeLevelOrderTraversal;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class SolutionTest {

    @Test
    public void test() {
        // given
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        // when
        List<List<Integer>> result1 = new Solution().levelOrder(root1);
        List<List<Integer>> result2 = new Solution().levelOrder(null);

        // then
        assertThat(result1).hasSize(3);
        assertThat(result1.get(0)).contains(3);
        assertThat(result1.get(1)).contains(9, 20);
        assertThat(result1.get(2)).contains(15, 7);

        assertThat(result2).isEmpty();

    }
    
}
