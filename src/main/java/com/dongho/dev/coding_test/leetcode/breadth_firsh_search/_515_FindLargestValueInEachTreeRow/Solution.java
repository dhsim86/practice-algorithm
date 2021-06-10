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

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<Integer> maxList = new ArrayList<>();

        while (queue.size() != 0) {
            List<TreeNode> nodeList = new ArrayList<>();
            int max = Integer.MIN_VALUE;

            while (queue.size() != 0) {
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);

                nodeList.add(node);
            }

            maxList.add(max);

            for (TreeNode node : nodeList) {
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return maxList;
    }

}
