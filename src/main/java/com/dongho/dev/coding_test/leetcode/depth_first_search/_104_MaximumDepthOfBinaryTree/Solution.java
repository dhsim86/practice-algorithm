package com.dongho.dev.coding_test.leetcode.depth_first_search._104_MaximumDepthOfBinaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Solution {

    private int traverse(TreeNode node, int cur) {
        if (node == null) {
            return cur;
        }

        return Math.max(traverse(node.left, cur + 1), traverse(node.right, cur + 1));
    }

    public int maxDepth(TreeNode root) {
        return traverse(root, 0);
    }

}
