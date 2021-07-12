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

    private Map<Integer, Integer> valueMap;
    private int pseudoPalindromicCount = 0;

    private boolean isPseudoPalindromic() {
        boolean hasOdd = false;
        Set<Integer> keySet = valueMap.keySet();

        if (keySet.size() == 0) {
            return false;
        }

        for (Integer key : keySet) {
            int value = valueMap.get(key);

            if (value % 2 == 1) {
                if (hasOdd == false) {
                    hasOdd = true;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }

        valueMap.put(node.val, valueMap.getOrDefault(node.val, 0) + 1);

        traverse(node.left);
        traverse(node.right);

        if (node.left == null && node.right == null && isPseudoPalindromic()) {
            pseudoPalindromicCount++;
        }

        valueMap.put(node.val, valueMap.getOrDefault(node.val, 0) - 1);
    }
    
    public int pseudoPalindromicPaths (TreeNode root) {
        valueMap = new HashMap<>();

        traverse(root);

        return pseudoPalindromicCount;
    }

}
