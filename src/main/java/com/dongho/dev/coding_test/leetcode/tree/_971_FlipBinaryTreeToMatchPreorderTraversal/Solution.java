package com.dongho.dev.coding_test.leetcode.tree._971_FlipBinaryTreeToMatchPreorderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

public class Solution {
    private List<Integer> values;
    private boolean isFailed = false;
    private int index = -1;

    private void traverse(TreeNode node, int[] voyage) {
        if (node == null) {
            return;
        }

        index++;

        if (node.val != voyage[index]) {
            isFailed = true;
            return;
        }

        if (node.left != null && node.left.val != voyage[index + 1]) {
            values.add(node.val);
            traverse(node.right, voyage);
            traverse(node.left, voyage);
        } else {
            traverse(node.left, voyage);
            traverse(node.right, voyage);
        }
    }

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        values = new ArrayList<>();
        traverse(root, voyage);

        if (isFailed) {
            return Collections.singletonList(-1);
        }

        return values;
    }
}
