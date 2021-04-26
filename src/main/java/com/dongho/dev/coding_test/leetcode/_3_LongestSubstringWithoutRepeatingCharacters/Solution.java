package com.dongho.dev.coding_test.leetcode._3_LongestSubstringWithoutRepeatingCharacters;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        String tmp = "";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (tmp.contains("" + s.charAt(i))) {
                if (result.length() < tmp.length()) {
                    result = tmp;
                }
                tmp += s.charAt(i);
                tmp = tmp.substring(tmp.indexOf(s.charAt(i)) + 1, tmp.length());
                System.out.println(tmp);
            } else {
                tmp += s.charAt(i);
            }
        }

        return result.length() < tmp.length() ? tmp.length() : result.length();
    }

}
