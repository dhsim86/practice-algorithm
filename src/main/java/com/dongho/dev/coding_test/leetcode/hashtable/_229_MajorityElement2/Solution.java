package com.dongho.dev.coding_test.leetcode.hashtable._229_MajorityElement2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        return map.entrySet().stream()
            .filter(e -> e.getValue() > nums.length / 3)
            .map(e -> e.getKey())
            .collect(Collectors.toList());
    }

}
