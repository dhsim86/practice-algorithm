package com.dongho.dev.coding_test.leetcode.greedy._392_IsSubsequence;

public class Solution {
    
    public boolean isSubsequence(String s, String t) {
        for (char c : t.toCharArray()) {
            if (s.isEmpty()) {
                break;
            }

            char target = s.charAt(0);

            if (c == target) {
                s = s.substring(1, s.length());
            }
        }

        return s.isEmpty() ? true : false;
    }

}
