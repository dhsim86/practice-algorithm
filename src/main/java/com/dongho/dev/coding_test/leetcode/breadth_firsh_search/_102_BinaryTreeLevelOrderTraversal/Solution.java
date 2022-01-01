package com.dongho.dev.coding_test.leetcode.breadth_firsh_search._102_BinaryTreeLevelOrderTraversal;

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

        List<List<Integer>> resultList = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.isEmpty() == false) {
            List<Integer> levelList = new ArrayList<>();
            Queue<TreeNode> newQueue = new LinkedList<>();

            while (queue.isEmpty() == false) {
                TreeNode node = queue.poll();
                levelList.add(node.val);

                if (node.left != null) {
                    newQueue.add(node.left);
                }
                
                if (node.right != null) {
                    newQueue.add(node.right);
                }
            }

            resultList.add(levelList);
            queue = newQueue;
        }
        
        return resultList;
    }

}
