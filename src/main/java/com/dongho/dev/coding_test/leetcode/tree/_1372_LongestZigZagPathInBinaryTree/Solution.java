package com.dongho.dev.coding_test.leetcode.tree._1372_LongestZigZagPathInBinaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {

    private int val = 0;

    private void walk(TreeNode node, boolean isLeftWalk, int cur) {
        if (node == null) {
            return;
        }

        val = Math.max(val, cur);

        if (isLeftWalk) {
            walk(node.left, true, 1);
            walk(node.right, false, cur + 1);
        } else {
            walk(node.left, true, cur + 1);
            walk(node.right, false, 1);
        }
    }
    
    public int longestZigZag(TreeNode root) {
        walk(root.left, true, 1);
        walk(root.right, false, 1);

        return val;
    }

}

