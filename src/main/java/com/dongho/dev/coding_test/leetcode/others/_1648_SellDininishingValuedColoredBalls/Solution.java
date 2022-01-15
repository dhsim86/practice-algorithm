package com.dongho.dev.coding_test.leetcode.others._1648_SellDininishingValuedColoredBalls;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    // 2 1
    // 5 4 3

    public int maxProfit(int[] inventory, int orders) {
        Queue<Integer> queue = new PriorityQueue<>((v1, v2) -> Integer.compare(v2, v1));
        int max = (int)Math.pow(10, 9) + 7;
        int sum = 0;

        for (int item : inventory) {
            queue.add(item);
        }

        for (int i = 0; i < orders; i++) {
            int val = queue.poll();
            sum += val;

            queue.add(val - 1);

            if (sum > max) {
                sum %= max;
            }
        }

        return sum;
    }

}
