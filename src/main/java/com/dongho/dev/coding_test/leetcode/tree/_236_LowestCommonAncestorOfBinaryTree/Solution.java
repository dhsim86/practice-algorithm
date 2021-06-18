package com.dongho.dev.coding_test.leetcode.tree._236_LowestCommonAncestorOfBinaryTree;

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

    private TreeNode traverse(TreeNode node, int pValue, int qValue) {
        if (node == null) {
            return null;
        }

        if (node.val == pValue || node.val == qValue) {
            return node;
        }

        TreeNode result1 = traverse(node.left, pValue, qValue);
        TreeNode result2 = traverse(node.right, pValue, qValue);

        if (result1 != null && result2 != null) {
            return node;
        }
        if (result1 != null) {
            return result1;
        }
        if (result2 != null) {
            return result2;
        }

        return null;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val == root.val || q.val == root.val) {
            return root;
        }

        TreeNode result1 = traverse(root.left, p.val, q.val);
        TreeNode result2 = traverse(root.right, p.val, q.val);

        if (result1 != null && result2 != null) {
            return root;
        }

        if (result1 != null) {
            return result1;
        }

        if (result2 != null) {
            return result2;
        }

        return null;
    }
}
