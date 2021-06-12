package com.dongho.dev.coding_test.leetcode.tree._404_SumOfLeftLeaves;

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

    private int calculateLeftLeavesValue(TreeNode node, boolean isSum) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            if (isSum) {
                return node.val;
            }
        }

        int val = calculateLeftLeavesValue(node.left, true);
        
        if (node.right != null) {
            val += calculateLeftLeavesValue(node.right, false);
        }

        return val;
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        }

        return calculateLeftLeavesValue(root, false);
    }

}
