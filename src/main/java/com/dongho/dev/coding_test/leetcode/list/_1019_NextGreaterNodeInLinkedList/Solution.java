package com.dongho.dev.coding_test.leetcode.list._1019_NextGreaterNodeInLinkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution {

    private static class Pair implements Comparable<Pair> {
        private int val;
        private int index;

        public Pair(int val, int index) {
            this.val = val;
            this.index = index;
        }

        @Override
        public int compareTo(Pair o) {
            int result = Integer.compare(val, o.val);

            if (result == 0) {
                return Integer.compare(index, o.index);
            }

            return result;
        }
    }
    
    public int[] nextLargerNodes(ListNode head) {
        Queue<Pair> queue = new PriorityQueue<>();
        List<Pair> pairList = new ArrayList<>();

        ListNode node = head;
        int index = 0;

        while (node != null) {        
            while (queue.isEmpty() == false && node.val > queue.peek().val) {
                Pair pair = queue.poll();
                pair.val = node.val;

                pairList.add(pair);
            }

            queue.add(new Pair(node.val, index));

            index++;
            node = node.next;
        }

        while (queue.isEmpty() == false) {
            Pair pair = queue.poll();
            pair.val = 0;
            pairList.add(pair);
        }

        return pairList.stream()
            .sorted(Comparator.comparingInt(p -> p.index))
            .mapToInt(p -> p.val)
            .toArray();
    }
    
}
