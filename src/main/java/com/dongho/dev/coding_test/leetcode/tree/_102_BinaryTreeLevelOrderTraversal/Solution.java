package com.dongho.dev.coding_test.leetcode.tree._102_BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
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
        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (queue.isEmpty() == false) {
            List<TreeNode> tempList = new LinkedList<>();

            while (queue.isEmpty() == false) {
                TreeNode node = queue.poll();

                if (node != null) {
                    tempList.add(node);
                }
            }

            List<Integer> levelResult = new ArrayList<>();
            
            while (tempList.isEmpty() == false) {
                TreeNode node = tempList.remove(0);

                levelResult.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }

            if (levelResult.isEmpty() == false) {
                result.add(levelResult);
            }
        }
        
        return result;
    }

}
