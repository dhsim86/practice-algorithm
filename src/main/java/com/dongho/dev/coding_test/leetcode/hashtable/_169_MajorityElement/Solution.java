package com.dongho.dev.coding_test.leetcode.hashtable._169_MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;
        int major = 0;

        for (int i = 0; i < nums.length; i++) {
             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
             
             if (max < map.get(nums[i])) {
                 major = nums[i];
                 max = map.get(nums[i]);
             }
        }

        return major;
    }
    
}
