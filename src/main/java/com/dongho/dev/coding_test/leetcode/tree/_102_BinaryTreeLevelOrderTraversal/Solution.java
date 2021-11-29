package com.dongho.dev.coding_test.leetcode.tree._102_BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
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

public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);

        while (queue.isEmpty() == false) {
            List<Integer> list = new ArrayList<>();
            Queue<TreeNode> nextQueue = new LinkedList<>();

            while (queue.isEmpty() == false) {
                TreeNode node = queue.poll();
                list.add(node.val);

                if (node.left != null) {
                    nextQueue.add(node.left);
                }

                if (node.right != null) {
                    nextQueue.add(node.right);
                }
            }

            result.add(list);
            queue = nextQueue;
        }

        return result;
    } 

}
