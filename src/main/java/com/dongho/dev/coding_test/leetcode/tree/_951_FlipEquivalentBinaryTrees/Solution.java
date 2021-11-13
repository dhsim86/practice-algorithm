package com.dongho.dev.coding_test.leetcode.tree._951_FlipEquivalentBinaryTrees;

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

class Solution {
    private void flip(TreeNode parent1, TreeNode parent2) {
        if (parent1 != null && parent2 != null) {
            if ((parent1.left != null && parent2.left != null && parent1.left.val != parent2.left.val) ||
                (parent1.right == null && parent2.left == null) || (parent1.left == null && parent2.right == null)) {
                TreeNode node = parent1.left;
                parent1.left = parent1.right;
                parent1.right = node;
            }
        }
    }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 != null && root2 != null && root1.val == root2.val) {
            flip(root1, root2);
            return flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
        }

        return false;
    }
}