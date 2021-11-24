package com.dongho.dev.coding_test.leetcode.array._565_ArrayNesting;

public class Solution {

    public int arrayNesting(int[] nums) {
        int result = Integer.MIN_VALUE;
        boolean[] visited = new boolean[nums.length];
    
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == false) {
                int index = i;
                int startVal = nums[index];

                int count = 0;
                int val;

                do {
                    visited[index] = true;
                    val = nums[index];
                    count++;

                    index = val;
                } while (startVal != nums[index]);

                result = Math.max(result, count);
            }
        }

        return result;
    }
}