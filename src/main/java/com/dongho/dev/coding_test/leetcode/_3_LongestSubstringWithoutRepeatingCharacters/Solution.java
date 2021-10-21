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
            } else {
                tmp += s.charAt(i);
            }
        }

        return result.length() < tmp.length() ? tmp.length() : result.length();
    }

    public int lengthOfLongestSubstringUsingSlidingWindow(String s) {
        int startIndex = 0;
        int endIndex = 0;
        int max = 0;

        if (s.length() == 0) {
            return 0;
        }

        while(endIndex < s.length()) {
            String subString = s.substring(startIndex, endIndex);
            
            if (subString.length() == 0) {
                endIndex++;
                continue;
            }

            int foundIndex = subString.indexOf(s.charAt(endIndex));
            if (foundIndex >= 0) {
                max = subString.length() > max ? subString.length() : max;
                startIndex = startIndex + foundIndex + 1;
            }

            endIndex++;

            if (endIndex >= s.length() && max < endIndex - startIndex) {
                return endIndex - startIndex;
            }
        }

        if (max == 0) {
            return s.length();
        }

        return max;
    }

}
