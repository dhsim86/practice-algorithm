package com.dongho.dev.coding_test.leetcode.list._147_InsertionSortList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {

    private ListNode insertForSort(ListNode node, ListNode target) {
        ListNode prev = null;
        ListNode candidate = node;

        while (candidate != null) {
            if (candidate.val > target.val) {
                break;
            }

            prev = candidate;
            candidate = candidate.next;
        }

        if (prev == null) {
            target.next = node;
            return target;
        } else {
            target.next = candidate;
            prev.next = target;
            return node;
        }
    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode sorted = head;
        ListNode unSorted = head.next;
        sorted.next = null;

        while (unSorted != null) {
            ListNode target = unSorted;
            unSorted = unSorted.next;

            target.next = null;
            sorted = insertForSort(sorted, target);
        }

        return sorted;
    }

}
