package com.dongho.dev.coding_test.leetcode.breadth_firsh_search._515_FindLargestValueInEachTreeRow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
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
    
    public List<Integer> largestValues(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (queue.isEmpty() == false) {
            Queue<TreeNode> newQueue = new LinkedList<>();
            int max = Integer.MIN_VALUE;

            while (queue.isEmpty() == false) {
                TreeNode node = queue.poll();

                max = Math.max(max, node.val);

                if (node.left != null) {
                    newQueue.add(node.left);
                }

                if (node.right != null) {
                    newQueue.add(node.right);
                }
            }

            result.add(max);
            queue = newQueue;
        }

        return result;
    }

}
