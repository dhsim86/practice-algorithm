package com.dongho.dev.coding_test.leetcode.breadth_firsh_search._111_MinimumDepthOfBinaryTree;

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
    private int getDepth(TreeNode root, int currentDepth) {
        if (root == null) {
            return currentDepth;
        }

        int left = getDepth(root.left, currentDepth + 1);
        int right = getDepth(root.right, currentDepth + 1);

        if (root.left != null && root.right != null) {
            return Math.min(left, right);
        }

        if (root.left == null) {
            return right;
        }

        return left;
    }

    public int minDepth(TreeNode root) {
        return getDepth(root, 0);
    }
}
