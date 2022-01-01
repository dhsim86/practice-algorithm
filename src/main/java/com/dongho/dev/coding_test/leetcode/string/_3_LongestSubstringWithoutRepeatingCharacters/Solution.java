package com.dongho.dev.coding_test.leetcode.string._3_LongestSubstringWithoutRepeatingCharacters;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        String sub = "";
        int index = 0;
        int max = 0;

        while (index < s.length()) {
            char c = s.charAt(index);
            int indexOf = sub.indexOf(c);

            if (indexOf == -1) {
                sub = sub + c;
            } else {
                sub = sub.substring(indexOf + 1, sub.length());
                sub = sub + c;
            }

            max = Math.max(max, sub.length());
            index++;
        }

        return max;
    }

}
