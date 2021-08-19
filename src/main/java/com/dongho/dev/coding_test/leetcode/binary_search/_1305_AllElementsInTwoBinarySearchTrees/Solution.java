package com.dongho.dev.coding_test.leetcode.binary_search._1305_AllElementsInTwoBinarySearchTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

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

    private Queue<Integer> queue;

    private void traverseTree(TreeNode node) {
        if (node == null) {
            return;
        }

        traverseTree(node.left);
        queue.add(node.val);
        traverseTree(node.right);
    }


    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        queue = new PriorityQueue<>();

        traverseTree(root1);
        traverseTree(root2);

        List<Integer> list = new ArrayList<>();

        while (queue.isEmpty() == false) {
            list.add(queue.poll());
        }

        return list;
    }
}
