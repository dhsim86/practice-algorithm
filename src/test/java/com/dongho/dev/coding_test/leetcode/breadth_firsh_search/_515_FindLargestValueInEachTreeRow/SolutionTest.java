package com.dongho.dev.coding_test.leetcode.breadth_firsh_search._515_FindLargestValueInEachTreeRow;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);

        root.right.right = new TreeNode(9);

        // when
        List<Integer> result = new Solution().largestValues(root);

        // then
        assertThat(result).containsExactly(1, 3, 9);
    }

}
