package com.dongho.dev.coding_test.leetcode.hashtable._409_LongestPalindrome;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        boolean hasOdd = false;
        int count = 0;

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            if (map.get(c) % 2 == 0) {
                count += map.get(c);
            } else {
                hasOdd = true;
                count += (map.get(c) / 2 * 2);
            }
        }

        return count + (hasOdd ? 1 : 0);
    }

}
