package com.dongho.dev.coding_test.leetcode.tree._1530_NumberOfGoodLeafNodesPairs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
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

    private Map<TreeNode, Node> map = new HashMap<>();

    private class Node {
        private TreeNode parent;
        private boolean isVisited;

        public Node(TreeNode parent) {
            this.parent = parent;
            this.isVisited = false;
        }
    }

    private void construct(TreeNode node, TreeNode parent, int depth) {
        if (node == null) {
            return;
        }

        map.put(node, new Node(parent));

        construct(node.left, node, depth + 1);
        construct(node.right, node, depth + 1);
    }

    private int getPath(TreeNode leaf, TreeNode target, int dist) {
        if (leaf == null || target == null) {
            return Integer.MIN_VALUE;
        }

        if (map.get(leaf).isVisited) {
            return Integer.MIN_VALUE;
        }

        if (leaf == target) {
            return dist;
        }

        map.get(leaf).isVisited = true;

        int result = 0;
        result = Math.max(getPath(leaf.left, target, dist + 1), result);
        result = Math.max(getPath(leaf.right, target, dist + 1), result);

        TreeNode parent = map.get(leaf).parent;
        result = Math.max(getPath(parent, target, dist + 1), result);

        map.get(leaf).isVisited = false;

        return result;
    }

    public int countPairs(TreeNode root, int distance) {
        if (root.left == null && root.right == null) {
            return 0;
        }

        construct(root, null, 0);
        Set<TreeNode> leafNodeSet = map.keySet().stream()
            .filter(key -> key.left == null && key.right == null)
            .collect(Collectors.toSet());

        int count = 0;

        for (TreeNode leafNode : leafNodeSet) {
            for (TreeNode otherNode : leafNodeSet) {
                if (leafNode == otherNode) {
                    continue;
                }

                int result = getPath(leafNode, otherNode, 0);

                if (result <= distance) {
                    count++;
                }
            }
        }

        return count / 2;
    }

}
