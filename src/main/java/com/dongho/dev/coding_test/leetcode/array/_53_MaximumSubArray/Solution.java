package com.dongho.dev.coding_test.leetcode.array._53_MaximumSubArray;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {

    public int maxSubArray(int[] nums) {
        // refers: https://leetcode.com/problems/maximum-subarray/discuss/1560342/Maximum-Subarray-in-Java

        int sum = nums[0];
        int res = nums[0];
        
        log.info("start for array: {}", nums);
        log.info("sum: {}, res: {}", sum, res);

        for (int i = 1; i < nums.length; i++) {
            sum = Integer.max(nums[i], sum + nums[i]);
            res = Integer.max(res, sum);

            log.info("sum: {}, res: {}", sum, res);
        }

        return res;
    }
    
}
