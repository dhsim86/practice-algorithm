package com.dongho.dev.coding_test.leetcode.depth_first_search._100_SameTree;

import java.util.LinkedList;
import java.util.Queue;

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
        Queue<TreeNode> pQueue = new LinkedList<>();
        Queue<TreeNode> qQueue = new LinkedList<>();

        pQueue.add(p);
        qQueue.add(q);

        while (pQueue.isEmpty() == false && qQueue.isEmpty() == false) {
            TreeNode pNode = pQueue.poll();
            TreeNode qNode = qQueue.poll();

            if ((pNode == null && qNode != null) ||
                (pNode != null && qNode == null)) {
                    return false;
            }

            if (pNode == null && qNode == null) {
                continue;
            }

            if (pNode.val != qNode.val) {
                return false;
            }

            pQueue.add(pNode.left);
            pQueue.add(pNode.right);
            qQueue.add(qNode.left);
            qQueue.add(qNode.right);
        }

        if (pQueue.isEmpty() == false || qQueue.isEmpty() == false) {
            return false;
        }

        return true;
    }

}
