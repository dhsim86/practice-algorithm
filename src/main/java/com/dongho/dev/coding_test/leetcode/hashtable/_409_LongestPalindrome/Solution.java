package com.dongho.dev.coding_test.leetcode.hashtable._409_LongestPalindrome;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int val = map.entrySet().stream()
            .map(e -> e.getValue() / 2 * 2)
            .reduce(0, Integer::sum);

        boolean hasOdd = map.entrySet().stream()
            .anyMatch(e -> e.getValue() % 2 == 1);
        return hasOdd ? val + 1 : val;
    }

}

