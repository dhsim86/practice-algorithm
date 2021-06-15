package com.dongho.dev.coding_test.leetcode.hashtable._771_JewelsAndStones;

import java.util.Map;
import java.util.stream.Collectors;

public class Solution {
    
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = jewels.chars().mapToObj(c -> (char)c)
            .collect(Collectors.toMap(c -> c, c -> 0));

        for (int i = 0; i < stones.length(); i++) {
            Character stone = stones.charAt(i);
            
            if (map.containsKey(stone)) {
                map.put(stone, map.get(stone) + 1);
            }
        }

        return map.values().stream()
            .reduce(0, Integer::sum);
    }

}
