package com.dongho.dev.coding_test.leetcode.hashtable._383_RansomNote;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : ransomNote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        return !map.values().stream()
            .anyMatch(v -> v > 0);
    }
}
