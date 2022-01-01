package com.dongho.dev.coding_test.leetcode.list._2_AddTwoNumbers;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int nextVal = 0;
        int base = 10;

        ListNode node = null;
        ListNode current = null;

        do {
            if (node == null) {
                node = current = new ListNode();
            } else {
                current.next = new ListNode();
                current = current.next;
            }

            int sum = l1.val + l2.val + nextVal;

            current.val = sum % base;
            nextVal = sum / base;

            l1 = l1.next;
            l2 = l2.next;

        } while (l1 != null && l2 != null);

        ListNode remainTarget = null;

        if (l1 == null) {
            remainTarget = l2;
        } else if (l2 == null) {
            remainTarget = l1;
        }

        while (remainTarget != null) {
            current.next = new ListNode();
            current = current.next;

            int sum = remainTarget.val + nextVal;
            current.val = sum % base;
            nextVal = sum / base;

            remainTarget = remainTarget.next;
        };

        if (nextVal != 0) {
            current.next = new ListNode();
            current = current.next;
            current.val = nextVal;
        }


        return node;
    }
    
}
