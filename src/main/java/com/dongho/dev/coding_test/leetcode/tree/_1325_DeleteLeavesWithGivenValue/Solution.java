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

    public TreeNode postfixTraverseAndDelete(TreeNode root, int target) {
        if (root == null) {
            return null;
        }

        root.left = postfixTraverseAndDelete(root.left, target);
        root.right = postfixTraverseAndDelete(root.right, target);

        if (root.val == target && root.left == null && root.right == null) {
            return null;
        }

        return root;
    }

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        root = postfixTraverseAndDelete(root, target);
        return root;
    }
}
