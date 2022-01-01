package com.dongho.dev.coding_test.leetcode.array._53_MaximumSubArray;

public class Solution {

    public int maxSubArray(int[] nums) {
        // refers: https://leetcode.com/problems/maximum-subarray/discuss/1560342/Maximum-Subarray-in-Java
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);
        }

        return max;
    }
    
}
