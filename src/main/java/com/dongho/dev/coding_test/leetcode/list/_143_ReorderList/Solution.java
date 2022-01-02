package com.dongho.dev.coding_test.leetcode.list._143_ReorderList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
};

public class Solution {
    
    public void reorderList(ListNode head) {
        Queue<ListNode> queue = new LinkedList<>();
        Stack<ListNode> stack = new Stack<>();

        int count = 0;

        while (head != null) {
            queue.add(head);
            stack.add(head);
            head = head.next;
            count++;
        }

        ListNode newHead = null;
        ListNode current = null;

        for (int i = 0; i < count; i++) {
            ListNode newNode;

            if (i % 2 == 0) {
                newNode = queue.poll();
            } else {
                newNode = stack.pop();
            }

            newNode.next = null;

            if (newHead == null) {
                newHead = current = newNode;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }

        head = newHead;
    }

}
