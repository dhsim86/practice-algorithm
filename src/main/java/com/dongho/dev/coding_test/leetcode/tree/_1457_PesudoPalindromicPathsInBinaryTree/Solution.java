package com.dongho.dev.coding_test.leetcode.tree._1457_PesudoPalindromicPathsInBinaryTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    private Map<Integer, Integer> countMap = new HashMap<>();
    private int count = 0;

    private boolean isPseudoPalindromic() {
        long oddCount = countMap.values().stream()
            .filter(v -> v % 2 == 1)
            .count();

        if (oddCount <= 1) {
            return true;
        }

        return false;
    }

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }

        countMap.put(node.val, countMap.getOrDefault(node.val, 0) + 1);

        if (node.left == null && node.right == null && isPseudoPalindromic()) {
            count++;
        }

        traverse(node.left);
        traverse(node.right);

        countMap.put(node.val, countMap.get(node.val) - 1);
    }

    public int pseudoPalindromicPaths (TreeNode root) {
        traverse(root);
        return count;
    }

}
