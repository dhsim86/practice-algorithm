package com.dongho.dev.coding_test.leetcode.list._147_InsertionSortList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {

    private ListNode insertForSort(ListNode head, ListNode node) {
        ListNode prev = null;
        ListNode candidate = head;

        while (candidate != null) {
            if (node.val < candidate.val) {
                break;
            }

            prev = candidate;
            candidate = candidate.next;
        }

        if (prev == null) {
            node.next = head;
            head = node;
        } else {
            node.next = candidate;
            prev.next = node;
        }

        return head;
    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode sorted = head;
        ListNode unSorted = head.next;
        sorted.next = null;

        while (unSorted != null) {
            ListNode node = unSorted;
            unSorted = unSorted.next;
            node.next = null;

            sorted = insertForSort(sorted, node);
        }

        return sorted;
    }
}
