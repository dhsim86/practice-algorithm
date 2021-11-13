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

        List<Integer> results = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.isEmpty() == false) {
            int max = Integer.MIN_VALUE;
            List<TreeNode> childs = new ArrayList<>();

            while (queue.isEmpty() == false) {
                TreeNode node = queue.poll();
        
                max = Math.max(node.val, max);
                
                if (node.left != null) {
                    childs.add(node.left);
                }
                if (node.right != null) {
                    childs.add(node.right);
                }
            }

            results.add(max);
            for (TreeNode child : childs) {
                queue.add(child);
            }
        }

        return results;
    }

}
