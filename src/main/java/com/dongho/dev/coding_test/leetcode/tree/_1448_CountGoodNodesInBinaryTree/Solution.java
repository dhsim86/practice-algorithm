package com.dongho.dev.coding_test.leetcode.tree._1448_CountGoodNodesInBinaryTree;

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

    private int getCount(TreeNode node, int max) {
        if (node == null) {
            return 0;
        }

        int count = 0;

        if (node.val >= max) {
            count++;
        }

        count += getCount(node.left, Integer.max(max, node.val));
        count += getCount(node.right, Integer.max(max, node.val));

        return count;
    }

    public int goodNodes(TreeNode root) {
        return getCount(root, root.val);
    }

}
