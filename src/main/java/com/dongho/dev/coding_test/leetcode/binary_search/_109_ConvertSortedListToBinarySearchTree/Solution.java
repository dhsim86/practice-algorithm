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

    private TreeNode getBinaryTree(List<Integer> numList, int start, int end) {
        if (end - start <= 0) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(numList.get(mid));
        node.left = getBinaryTree(numList, start, mid);
        node.right = getBinaryTree(numList, mid + 1, end);

        return node;
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

        return getBinaryTree(numList, 0, numList.size());
    }

}
