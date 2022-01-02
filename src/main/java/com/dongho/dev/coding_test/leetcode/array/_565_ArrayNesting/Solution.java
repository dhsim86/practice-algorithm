package com.dongho.dev.coding_test.leetcode.array._565_ArrayNesting;

public class Solution {

    public int arrayNesting(int[] nums) {
        int max = 0;
        boolean[] visited = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == false) {
                int count = 0;
                int index = i;

                do {
                    visited[index] = true;
                    count++;
                    index = nums[index];
                } while (nums[index] != nums[i]);

                max = Math.max(max, count);
            }
        }

        return max;
    }
}