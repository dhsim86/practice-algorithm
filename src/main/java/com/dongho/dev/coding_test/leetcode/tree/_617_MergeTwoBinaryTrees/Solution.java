package com.dongho.dev.coding_test.leetcode.tree._617_MergeTwoBinaryTrees;

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

    private TreeNode merge(TreeNode node1, TreeNode node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }

        TreeNode node = new TreeNode(node1.val + node2.val);
        node.left = merge(node1.left, node2.left);
        node.right = merge(node1.right, node2.right);

        return node;
    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }

}
