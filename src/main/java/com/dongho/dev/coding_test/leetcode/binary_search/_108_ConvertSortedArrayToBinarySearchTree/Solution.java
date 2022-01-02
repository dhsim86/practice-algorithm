package com.dongho.dev.coding_test.leetcode.binary_search._108_ConvertSortedArrayToBinarySearchTree;

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

    private TreeNode getBinaryTree(int[] nums, int start, int end) {
        if (end - start <= 0) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = getBinaryTree(nums, start, mid);
        node.right = getBinaryTree(nums, mid + 1, end);

        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return getBinaryTree(nums, 0, nums.length);
    }
    
}
