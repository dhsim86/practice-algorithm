package com.dongho.dev.coding_test.leetcode.depth_first_search._108_ConvertSortedArrayToBinarySearchTree;

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

    public TreeNode getSubTree(TreeNode root, int[] nums, int start, int end) {
        if (end - start == 0) {
            return null;
        }

        int mid = (start + end) / 2;
        root.val = nums[mid];

        root.left = getSubTree(new TreeNode(), nums, start, mid);
        root.right = getSubTree(new TreeNode(), nums, mid + 1, end);

        return root;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return getSubTree(new TreeNode(), nums, 0, nums.length);
    }
    
}
