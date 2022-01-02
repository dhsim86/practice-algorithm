package com.dongho.dev.coding_test.leetcode.hashtable._169_MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0 ; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return map.entrySet().stream()
            .filter(e -> e.getValue() > nums.length / 2)
            .map(e -> e.getKey())
            .findFirst()
            .orElse(0);
    }
    
}
