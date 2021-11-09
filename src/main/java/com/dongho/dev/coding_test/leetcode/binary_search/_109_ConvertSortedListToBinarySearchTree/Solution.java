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

    private TreeNode getTreeNode(List<Integer> numList, int start, int end) {
        if (end - start == 0) {
            return null;
        }

        int mid = (start + end) / 2;

        TreeNode treeNode = new TreeNode(numList.get(mid));
        treeNode.left = getTreeNode(numList, start, mid);
        treeNode.right = getTreeNode(numList, mid + 1, end);

        return treeNode;
    }

    
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        List<Integer> numList = new ArrayList<>();
        while (head != null) {
            numList.add(head.val);
            head = head.next;
        }
        
        int start = 0;
        int end = numList.size();

        return getTreeNode(numList, start, end);
    }

}
