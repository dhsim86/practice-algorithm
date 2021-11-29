package com.dongho.dev.coding_test.leetcode.depth_first_search._101_SymmeticTree;

import java.util.Stack;

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

    public boolean isSymmetric(TreeNode root) {
        Stack<TreeNode> lStack = new Stack<>();
        Stack<TreeNode> rStack = new Stack<>();

        lStack.push(root);
        rStack.push(root);

        while (lStack.isEmpty() == false && rStack.isEmpty() == false) {
            TreeNode lNode = lStack.pop();
            TreeNode rNode = rStack.pop();

            if (lNode == null && rNode == null) {
                continue;
            }

            if (lNode != null && rNode == null) {
                return false;
            }

            if (lNode == null && rNode != null) {
                return false;
            }

            if (lNode.val != rNode.val) {
                return false;
            }

            lStack.push(lNode.left);
            lStack.push(lNode.right);

            rStack.push(rNode.right);
            rStack.push(rNode.left);
        }

        if (lStack.size() != rStack.size()) {
            return false;
        }

        return true;
    }

}
