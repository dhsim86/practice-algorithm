package com.dongho.dev.coding_test.leetcode.array._409_LongestPalindrome;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        boolean isFreqOddCharacter = false;
        int count = 0;

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            if (map.get(c) % 2 == 1) {
                isFreqOddCharacter = true;
            }
            count += map.get(c) / 2;
        }

        return isFreqOddCharacter ? 1 + 2 * count : 2 * count;
    }

}
