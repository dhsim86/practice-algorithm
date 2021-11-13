package com.dongho.dev.coding_test.leetcode.hashtable._771_JewelsAndStones;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> jewelMap = new HashMap<>();

        for (char c : jewels.toCharArray()) {
            jewelMap.put(c, 0);
        }

        for (char c : stones.toCharArray()) {
            if (jewelMap.containsKey(c)) {
                jewelMap.put(c, jewelMap.get(c) + 1);
            }
        }

        return jewelMap.values().stream()
            .reduce(0, Integer::sum);
    }

}
