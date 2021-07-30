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

    int number = 0;
    int result;

    private void getKthSmallestNode(TreeNode node, int k) {
        if (node == null || number == k) {
            return;
        }

        getKthSmallestNode(node.left, k);
        number++;

        if (number == k) {
            result = node.val;
        }

        getKthSmallestNode(node.right, k);
    }
    
    public int kthSmallest(TreeNode root, int k) {
        getKthSmallestNode(root, k);
        return result;
    }

}
