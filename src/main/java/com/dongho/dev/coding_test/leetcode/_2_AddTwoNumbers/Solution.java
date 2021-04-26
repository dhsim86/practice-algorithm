package com.dongho.dev.coding_test.leetcode._2_AddTwoNumbers;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l1;
        ListNode prevL1 = l1;

        int tmp = 0;
        int val = 0;
        int base = 10;

        while (l1 != null && l2 != null) {
            prevL1 = l1;

            val = (l1.val + l2.val + tmp) % base;
            tmp = (l1.val + l2.val + tmp) / base;
            l1.val = val;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            prevL1 = l1;

            val = (l1.val + tmp) % base;
            tmp = (l1.val + tmp) / base;
            l1.val = val;

            l1 = l1.next;
        }

        if (l2 != null) {
            prevL1.next = l2;

            while (l2 != null) {
                prevL1 = l2;

                val = (l2.val + tmp) % base;
                tmp = (l2.val + tmp) / base;
                l2.val = val;

                l2 = l2.next;
            }
        }

        if (tmp != 0) {
            prevL1.next = new ListNode(tmp);
        }

        return result;
    }
    
}
