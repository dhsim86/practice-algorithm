package com.dongho.dev.coding_test.leetcode.tree._124_BinaryTreeMaximumPathSum;

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

    private int max = Short.MIN_VALUE;

    private int calculate(TreeNode node) {
        if (node == null) {
            return Short.MIN_VALUE;
        }

        int left = calculate(node.left);
        int right = calculate(node.right);
        int pathMax = Math.max(node.val, Math.max(node.val + left, node.val + right));

        int all = node.val + left + right;
        max = Math.max(max, Math.max(pathMax, all));

        return pathMax;
    }

    public int maxPathSum(TreeNode root) {
        calculate(root);
        return max;
    }

}
