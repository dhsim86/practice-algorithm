package com.dongho.dev.coding_test.leetcode.tree._1325_DeleteLeavesWithGivenValue;

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

    private TreeNode deleteLeafNode(TreeNode parent, TreeNode node, int target) {
        if (node == null) {
            return null;
        }

        node.left = deleteLeafNode(node, node.left, target);
        node.right = deleteLeafNode(node, node.right, target);

        if (node.left == null && node.right == null && node.val == target) {
            return null;
        }

        return node;
    }

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return deleteLeafNode(null, root, target);
    }

}
