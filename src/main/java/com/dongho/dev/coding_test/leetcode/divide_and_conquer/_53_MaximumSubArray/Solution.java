package com.dongho.dev.coding_test.leetcode.divide_and_conquer._53_MaximumSubArray;

public class Solution {

    private int getSum(int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int maxSubArray(int[] nums) {
        int startIndex = 0;
        int endIndex = 0;

        int max = Integer.MIN_VALUE;

        while(true) {
            if (startIndex == nums.length || endIndex == nums.length) {
                break;
            }

            if (startIndex == endIndex) {
                endIndex++;
                continue;
            }

            int sum = getSum(nums, startIndex, endIndex);
            max = Math.max(max, sum);

            if (sum < 0) {
                startIndex = endIndex;
                continue;
            }

            endIndex++;
        }

        max = Math.max(max, getSum(nums, startIndex, endIndex));
        return max;
    }
    
}
