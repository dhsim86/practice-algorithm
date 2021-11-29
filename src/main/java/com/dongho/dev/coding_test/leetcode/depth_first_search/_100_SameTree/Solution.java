package com.dongho.dev.coding_test.leetcode.depth_first_search._100_SameTree;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();

        pStack.push(p);
        qStack.push(q);

        while (pStack.isEmpty() == false && qStack.isEmpty() == false) {
            TreeNode pNode = pStack.pop();
            TreeNode qNode = qStack.pop();

            if (pNode == null && qNode == null) {
                continue;
            }

            if (pNode == null && qNode != null) {
                return false;
            }

            if (pNode != null && qNode == null) {
                return false;
            }

            if (pNode.val != qNode.val) {
                return false;
            }

            pStack.push(pNode.left);
            pStack.push(pNode.right);

            qStack.push(qNode.left);
            qStack.push(qNode.right);
        }

        if (pStack.size() != qStack.size()) {
            return false;
        }

        return true;
    }

}
