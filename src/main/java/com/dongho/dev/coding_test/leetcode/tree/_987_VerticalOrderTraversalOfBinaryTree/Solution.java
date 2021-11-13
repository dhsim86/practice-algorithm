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

    Map<Integer, Queue<NodeInfo>> map = new HashMap<>();

    private class NodeInfo implements Comparable<NodeInfo> {
        int val;
        int row;

        public NodeInfo(int val, int row) {
            this.val = val;
            this.row = row;
        }

        @Override
        public int compareTo(NodeInfo o) {
            if (row != o.row) {
                return Integer.compare(row, o.row);
            }
            return Integer.compare(val, o.val);
        }
    }

    private void traverse(TreeNode node, int row, int col) {
        if (node == null) {
            return;
        }

        Queue<NodeInfo> queue = map.get(col);
        if (queue == null) {
            queue = new PriorityQueue<>();
            map.put(col, queue);
        }

        queue.add(new NodeInfo(node.val, row));

        traverse(node.left, row + 1, col - 1);
        traverse(node.right, row + 1, col + 1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        traverse(root, 0, 0);

        List<Integer> keySet = map.keySet().stream()
            .sorted()
            .collect(Collectors.toList());

        List<List<Integer>> result = new ArrayList<>();

        for (Integer key : keySet) {
            List<Integer> newList = new ArrayList<>();
            Queue<NodeInfo> queue = map.get(key);

            while (queue.isEmpty() == false) {
                newList.add(queue.poll().val);
            }
            result.add(newList);
        }

        return result;
    }

}