package com.dongho.dev.coding_test.leetcode.tree._987_VerticalOrderTraversalOfBinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

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

    private Map<Integer, Queue<NodeInfo>> map;

    private static class NodeInfo implements Comparable<NodeInfo> {
        int val;
        int row;

        public NodeInfo(TreeNode node, int row, int col) {
            this.val = node.val;
            this.row = row;
        }

        @Override
        public int compareTo(NodeInfo other) {
            if (row < other.row) {
                return -1;
            }

            if (row > other.row) {
                return 1;
            }

            return Integer.compare(val, other.val);
        }
    }

    private Queue<NodeInfo> getNodeQueue(int column) {
        Queue<NodeInfo> queue = map.get(column);

        if (queue == null) {
            queue = new PriorityQueue<>();
            map.put(column, queue);
        }

        return queue;
    }

    private void traverse(TreeNode node, int row, int column) {
        if (node == null) {
            return;
        }

        traverse(node.left, row + 1, column - 1);

        Queue<NodeInfo> queue = getNodeQueue(column);
        queue.add(new NodeInfo(node, row, column));

        traverse(node.right, row + 1, column + 1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }

        map = new HashMap<>();
        traverse(root, 0, 0);

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> keyList = map.keySet().stream()
            .sorted()
            .collect(Collectors.toList());

        for (int key : keyList) {
            List<Integer> subList = new ArrayList<>();
            Queue<NodeInfo> queue = map.get(key);

            while (queue.isEmpty() == false) {
                subList.add(queue.poll().val);
            }

            result.add(subList);
        }

        return result;
    }
}
