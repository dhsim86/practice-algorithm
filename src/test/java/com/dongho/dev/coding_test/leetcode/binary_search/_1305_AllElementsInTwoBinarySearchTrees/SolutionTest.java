package com.dongho.dev.coding_test.leetcode.binary_search._1305_AllElementsInTwoBinarySearchTrees;

import java.util.List;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(3);

        // when
        List<Integer> result = new Solution().getAllElements(root1, root2);
        
        // then
        assertThat(result).isNotEmpty().containsExactly(0, 1, 1, 2, 3, 4);
    }
    
}
