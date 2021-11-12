package com.dongho.dev.coding_test.leetcode.others._143_ReorderList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
        List<ListNode> nodeList = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            nodeList.add(temp);
            temp = temp.next;
        }

        temp = null;
        boolean toggle = true;

        while (nodeList.isEmpty() == false) {
            ListNode node = null;
            if (toggle) {
                node = nodeList.remove(0);
            } else {
                node = nodeList.remove(nodeList.size() - 1);
            }
            if (temp == null) {
                temp = node;
                head = temp;
            } else {
                temp.next = node;
                temp = temp.next;
                temp.next = null;
            }

            toggle = !toggle;
        }
    }
}
