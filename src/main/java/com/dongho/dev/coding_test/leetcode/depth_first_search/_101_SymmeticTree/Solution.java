package com.dongho.dev.coding_test.leetcode.depth_first_search._101_SymmeticTree;

import java.util.LinkedList;

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

class SimpleStack<T> {

    private LinkedList<T> elementList;

    public SimpleStack() {
        elementList = new LinkedList<>();
    }

    public boolean isEmpty() {
        return elementList.size() == 0;
    }

    public void push(T element) {
        elementList.push(element);
    }

    public T pop() {
        return elementList.pop();
    }

}

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        SimpleStack<TreeNode> leftStack = new SimpleStack<>();
        SimpleStack<TreeNode> rightStack = new SimpleStack<>();

        leftStack.push(root.left);
        rightStack.push(root.right);

        while(leftStack.isEmpty() == false && rightStack.isEmpty() == false) {
            TreeNode left = leftStack.pop();
            TreeNode right = rightStack.pop();

            if (left == null && right == null) {
                continue;
            }

            if ((left == null && right != null) ||
                (right == null && left != null)) {
                return false;
            }

            if (left.val != right.val) {
                return false;
            }

            leftStack.push(left.right);
            leftStack.push(left.left);

            rightStack.push(right.left);
            rightStack.push(right.right);
        }

        if (leftStack.isEmpty() == false || rightStack.isEmpty() == false) {
            return false;
        }

        return true;
    }
}
