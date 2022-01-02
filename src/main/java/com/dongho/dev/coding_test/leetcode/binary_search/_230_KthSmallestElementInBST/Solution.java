package com.dongho.dev.coding_test.leetcode.binary_search._230_KthSmallestElementInBST;

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

    private int kth = 0;
    private int val = 0;

    private void traverse(TreeNode node, int k) {
        if (node == null) {
            return;
        }

        traverse(node.left, k);

        kth++;
        if (kth == k) {
            val = node.val;
        }

        traverse(node.right, k);
    }

    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return val;
    }

}
