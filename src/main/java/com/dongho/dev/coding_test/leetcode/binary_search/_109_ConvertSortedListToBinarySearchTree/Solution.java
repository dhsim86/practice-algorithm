package com.dongho.dev.coding_test.leetcode.binary_search._109_ConvertSortedListToBinarySearchTree;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

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

    private TreeNode getTreeNode(List<ListNode> nodeList, int start, int end) {
        if (end - start < 1) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nodeList.get(mid).val);
        node.left = getTreeNode(nodeList, start, mid);
        node.right = getTreeNode(nodeList, mid + 1, end);

        return node;
    }

    
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        List<ListNode> nodeList = new ArrayList<>();

        ListNode node = head;
        while (node != null) {
            nodeList.add(node);
            node = node.next;
        }

        return getTreeNode(nodeList, 0, nodeList.size());
    }

}
