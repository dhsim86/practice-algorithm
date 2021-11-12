package com.dongho.dev.coding_test.leetcode.tree._404_SumOfLeftLeaves;

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

    private int getValLeftValues(TreeNode parent, TreeNode node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            if (parent != null && parent.left == node) {
                return node.val;
            }
        }

        return getValLeftValues(node, node.left) + getValLeftValues(node, node.right);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return getValLeftValues(null, root);
    }

}
