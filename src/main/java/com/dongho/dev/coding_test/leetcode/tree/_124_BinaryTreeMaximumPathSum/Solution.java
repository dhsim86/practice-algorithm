package com.dongho.dev.coding_test.leetcode.tree._124_BinaryTreeMaximumPathSum;

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

    private int answer = Integer.MIN_VALUE;

    private int getValue(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftVal = getValue(root.left);
        int rightVal = getValue(root.right);

        int allVal = root.val + leftVal + rightVal;
        int partVal = Math.max(root.val, root.val + Math.max(leftVal, rightVal));

        answer = Math.max(answer, Math.max(allVal, partVal));
        return partVal;
    }

    
    public int maxPathSum(TreeNode root) {
        getValue(root);
        return answer;
    }

}
