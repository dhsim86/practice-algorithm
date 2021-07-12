package com.dongho.dev.coding_test.leetcode.tree._1457_PesudoPalindromicPathsInBinaryTree;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(3);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(1);
        root1.right = new TreeNode(1);
        root1.right.right = new TreeNode(1);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(3);
        root2.left.right.right = new TreeNode(1);
        root2.right = new TreeNode(1);

        TreeNode root3 = new TreeNode(9);

        // when
        int result1 = new Solution().pseudoPalindromicPaths(root1);
        int result2 = new Solution().pseudoPalindromicPaths(root2);
        int result3 = new Solution().pseudoPalindromicPaths(root3);

        // then
        assertThat(result1).isEqualTo(2);
        assertThat(result2).isEqualTo(1);
        assertThat(result3).isEqualTo(1);
    }

}
