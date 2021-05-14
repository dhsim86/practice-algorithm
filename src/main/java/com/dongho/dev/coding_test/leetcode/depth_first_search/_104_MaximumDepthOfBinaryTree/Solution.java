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

    public int recursionDepth(TreeNode node, int currentDepth) {
        if (node == null) {
            return currentDepth;
        }

        int left = recursionDepth(node.left, currentDepth + 1);
        int right = recursionDepth(node.right, currentDepth + 1);
        return Math.max(left, right);
    }
    
    public int maxDepth(TreeNode root) {
        return recursionDepth(root, 0);
    }

}
