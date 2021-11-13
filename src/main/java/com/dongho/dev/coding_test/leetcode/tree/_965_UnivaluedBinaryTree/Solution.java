package com.dongho.dev.coding_test.leetcode.tree._965_UnivaluedBinaryTree;

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

    private int val = 0;

    private boolean isSame(TreeNode node) {
        if (node == null) {
            return true;
        }

        return node.val == val && isSame(node.left) && isSame(node.right);
    }

    public boolean isUnivalTree(TreeNode root) {
        val = root.val;
        return isSame(root);
    }

}
