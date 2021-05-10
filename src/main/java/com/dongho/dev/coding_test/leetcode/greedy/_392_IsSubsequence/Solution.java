package com.dongho.dev.coding_test.leetcode.greedy._392_IsSubsequence;

public class Solution {
    
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        if (t.length() == 0) {
            return false;
        }

        int subsequentIndex = 0;
        int originalIndex = 0;

        while (subsequentIndex < s.length() && originalIndex < t.length()) {
            int found = t.substring(originalIndex, t.length()).indexOf(s.charAt(subsequentIndex));

            if (found >= 0) {
                subsequentIndex++;
                originalIndex = originalIndex + found + 1;
                continue;
            } else {
                break;
            }
        }

        if (subsequentIndex >= s.length()) {
            return true;
        }
        return false;
    }

}
