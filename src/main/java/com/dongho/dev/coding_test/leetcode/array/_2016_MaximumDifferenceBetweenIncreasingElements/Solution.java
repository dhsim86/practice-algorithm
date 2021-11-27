package com.dongho.dev.coding_test.leetcode.array._2016_MaximumDifferenceBetweenIncreasingElements;

public class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int val = nums[j] - nums[i] <= 0 ? -1 : nums[j] - nums[i];

                max = Math.max(max, val);
            }
        }

        return max;
    }
}
