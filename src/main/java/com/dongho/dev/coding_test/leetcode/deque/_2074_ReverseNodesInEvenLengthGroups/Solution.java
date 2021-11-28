package com.dongho.dev.coding_test.leetcode.deque._2074_ReverseNodesInEvenLengthGroups;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {
    
    public ListNode reverseEvenLengthGroups(ListNode head) {
        List<Deque<ListNode>> list = new ArrayList<>();

        ListNode node = head;
        int group = 1;

        while (node != null) {
            Deque<ListNode> deque = new LinkedList<>();

            for (int i = 0; i < group; i++) {
                if (node == null) {
                    break;
                }

                deque.add(node);;
                node = node.next;
            }

            if (deque.isEmpty() == false) {
                list.add(deque);
                group++;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Deque<ListNode> deque = list.get(i);
            int size = deque.size();

            if (i == 0) {
                head = node = deque.poll();
                continue;
            }

            if (size % 2 == 0) {
                while (deque.isEmpty() == false) {
                    node.next = deque.pollLast();
                    node = node.next;
                }
            } else {
                while (deque.isEmpty() == false) {
                    node.next = deque.pollFirst();
                    node = node.next;
                }
            }
            node.next = null;
        }
        return head;
    }

}
