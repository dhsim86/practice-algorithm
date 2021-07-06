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

    public boolean traverse(TreeNode node, int parentValue) {
        if (node == null) {
            return true;
        }

        if (parentValue != node.val) {
            return false;
        }

        return traverse(node.left, node.val) && traverse(node.right, node.val);
    }
    
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        return traverse(root, root.val);
    }

}
