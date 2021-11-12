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

    int result = 0;
    int order = 0;

    private void getKthSmallestNode(TreeNode node, int k) {
        if (node == null) {
            return;
        }

        getKthSmallestNode(node.left, k);
        order++;

        if (order == k) {
            result = node.val;
        }

        getKthSmallestNode(node.right, k);
    }


    public int kthSmallest(TreeNode root, int k) {
        getKthSmallestNode(root, k);
        return result;
    }

}
