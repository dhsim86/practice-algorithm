package com.dongho.dev.coding_test.leetcode.greedy._392_IsSubsequence;

public class Solution {
    
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        for (char c : s.toCharArray()) {
            int idx = t.indexOf(c);

            if (idx != -1) {
                t = t.substring(idx + 1, t.length());
            } else {
                return false;
            }
        }
        return true;
    }

}
