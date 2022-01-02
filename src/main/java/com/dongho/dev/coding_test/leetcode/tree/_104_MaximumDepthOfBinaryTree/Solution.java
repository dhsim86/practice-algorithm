package com.dongho.dev.coding_test.leetcode.tree._104_MaximumDepthOfBinaryTree;

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

    private int walk(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        return Math.max(walk(node.left, depth + 1), walk(node.right, depth + 1));
    }

    public int maxDepth(TreeNode root) {
        return walk(root, 0);
    }

}
