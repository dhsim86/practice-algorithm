package com.dongho.dev.coding_test.leetcode.others._143_ReorderList;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
};

public class Solution {
    
    public void reorderList(ListNode head) {
        List<ListNode> listNodeList = new ArrayList<>();

        for (ListNode node = head; node != null; node = node.next) {
            listNodeList.add(node);
        }

        int start = 0;
        int end = listNodeList.size() - 1;

        ListNode newHead = null;
        ListNode current = null;

        while (start <= end) {
            if (newHead == null) {
                newHead = listNodeList.get(start);
                current = newHead;
                current.next = null;
                start++;
            } else {
                current.next = listNodeList.get(start++);
                current = current.next;
                current.next = null;
            }
            
            if (start <= end) {
                current.next = listNodeList.get(end--);
                current = current.next;
                current.next = null;
            }
        }

        head = newHead;
    }

}
