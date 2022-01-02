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

    private int getValOfLeftLeaves(TreeNode parent, TreeNode node) {
        if (node == null) {
            return 0;
        }

        int val = 0;

        if (parent.left == node && node.left == null && node.right == null) {
            val = node.val;
        } else {
            val += getValOfLeftLeaves(node, node.left);
            val += getValOfLeftLeaves(node, node.right);
        }
        return val;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }

        return getValOfLeftLeaves(root, root.left) + getValOfLeftLeaves(root, root.right);
    }

}
