package com.dongho.dev.coding_test.leetcode.array._409_LongestPalindrome;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
    
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        boolean hasOddMember = false;
        int count = 0;

        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 == 1) {
                hasOddMember = true;
            }

            count += e.getValue() / 2;
        }

        return hasOddMember ? 1 + count * 2 : count * 2;
    }

}
