package com.dongho.dev.coding_test.leetcode.queue._1962_RemoveStonesToMinimizeTheTotal;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    
    public int minStoneSum(int[] piles, int k) {
        Queue<Integer> queue = new PriorityQueue<Integer>((a, b) -> Integer.compare(b, a));

        for (int pile : piles) {
            queue.add(pile);
        }

        for (int i = 0; i < k; i++) {
            int val = queue.poll();
            val = val - Math.floorDiv(val, 2);
            queue.add(val);
        }

        return queue.stream()
            .reduce(0, Integer::sum);
    }

}
