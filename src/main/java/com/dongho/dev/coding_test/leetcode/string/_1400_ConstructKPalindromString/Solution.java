package com.dongho.dev.coding_test.leetcode.string._1400_ConstructKPalindromString;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    
    public boolean canConstruct(String s, int k) {
        // If the s.length < k we cannot construct k strings from s and answer is false.
        if (s.length() < k) {
            return false;
        }

        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        long oddCount = countMap.values().stream()
            .filter(v -> v % 2 == 1)
            .count();

        /*
            If the number of characters that have odd counts is > k 
            then the minimum number of palindrome strings we can construct is > k and answer is false.

            Otherwise you can construct exactly k palindrome strings and answer is true
        */
        if (oddCount > k) {
            return false;
        }

        return true;
    }

}
