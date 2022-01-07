package com.dongho.dev.coding_test.leetcode.breadth_firsh_search._841_KeysAndRooms;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        visited[0] = true;
        int visitedCount = 1;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);

        while (queue.isEmpty() == false) {

            Queue<Integer> next = new LinkedList<>();

            while (queue.isEmpty() == false) {
                int roomId = queue.poll();
                List<Integer> keys = rooms.get(roomId);

                for (int key : keys) {
                    if (!visited[key]) {
                        visited[key] = true;
                        visitedCount++;

                        next.add(key);
                    }
                }
            }

            queue = next;
            
            if (visitedCount == rooms.size()) {
                return true;
            }
        }

        return false;
    }

}
