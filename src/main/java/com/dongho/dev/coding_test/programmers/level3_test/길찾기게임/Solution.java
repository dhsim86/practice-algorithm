package com.dongho.dev.coding_test.programmers.level3_test.길찾기게임;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

class TreeNode {
    int v;
    int number;

    TreeNode left;
    TreeNode right;

    public TreeNode(int v, int number) {
        this.v = v;
        this.number = number;
    }
}

public class Solution {

    private SortedMap<Integer, List<TreeNode>> nodeInfoMap = new TreeMap<>();

    private void insert(TreeNode parent, TreeNode node) {
        if (parent == null) {
            return;
        }

        if (node.v < parent.v) {
            if (parent.left != null) {
                insert(parent.left, node);
            } else {
                parent.left = node;
            }
        } else if (node.v > parent.v) {
            if (parent.right != null) {
                insert(parent.right, node);
            } else {
                parent.right = node;
            }
        }
    }

    private void preorderTraverse(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        result.add(node.number);

        preorderTraverse(node.left, result);
        preorderTraverse(node.right, result);
    }

    private void postorderTraverse(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        postorderTraverse(node.left, result);
        postorderTraverse(node.right, result);

        result.add(node.number);
    }

    public int[][] solution(int[][] nodeinfo) {
        for (int i = 0; i < nodeinfo.length; i++) {
            int x = nodeinfo[i][0];
            int y = nodeinfo[i][1];

            List<TreeNode> nodeInfoList = nodeInfoMap.getOrDefault(y, new ArrayList<>());
            
            TreeNode treeNode = new TreeNode(x, i + 1);
            nodeInfoList.add(treeNode);
            nodeInfoMap.put(y, nodeInfoList);
        }

        TreeNode root = nodeInfoMap.get(nodeInfoMap.lastKey()).get(0);
        nodeInfoMap.remove(nodeInfoMap.lastKey());

        while(nodeInfoMap.isEmpty() == false) {
            int lastKey = nodeInfoMap.lastKey();

            List<TreeNode> nodeList = nodeInfoMap.get(lastKey);
            nodeInfoMap.remove(lastKey);

            for (TreeNode node : nodeList) {
                insert(root, node);
            }
        }

        List<Integer> preOrderResult = new ArrayList<>();
        List<Integer> postOrderResult = new ArrayList<>();

        preorderTraverse(root, preOrderResult);
        postorderTraverse(root, postOrderResult);

        int[][] answer = { preOrderResult.stream().mapToInt(i -> i).toArray(), 
            postOrderResult.stream().mapToInt(i -> i).toArray()
        };
        return answer;
    }
}
