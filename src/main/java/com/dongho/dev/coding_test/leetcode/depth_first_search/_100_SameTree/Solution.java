package com.dongho.dev.coding_test.leetcode.depth_first_search._100_SameTree;

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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        SimpleStack<TreeNode> pStack = new SimpleStack<>();
        SimpleStack<TreeNode> qStack = new SimpleStack<>();

        pStack.push(p);
        qStack.push(q);

        while (!pStack.isEmpty() && !qStack.isEmpty()) {
            TreeNode pNode = pStack.pop();
            TreeNode qNode = qStack.pop();

            if ((pNode == null && qNode != null) ||
                (qNode == null && pNode != null)) {
                return false;
            }

            if (pNode == null && qNode == null) {
                continue;
            }

            if (pNode.val != qNode.val) {
                return false;
            }

            pStack.push(pNode.left);
            pStack.push(pNode.right);

            qStack.push(qNode.left);
            qStack.push(qNode.right);
        }

        if ((pStack.isEmpty() && qStack.isEmpty() == false) ||
            (qStack.isEmpty() && pStack.isEmpty() == false)) {
            return false;
        }

        return true;
    }

}
