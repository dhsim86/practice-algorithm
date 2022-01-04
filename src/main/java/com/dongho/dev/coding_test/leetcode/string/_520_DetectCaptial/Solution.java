package com.dongho.dev.coding_test.leetcode.string._520_DetectCaptial;

public class Solution {
    
    public boolean detectCapitalUse(String word) {
        boolean firstCaptial = false;
        boolean useUppercase = false;
        boolean useLowercase = false;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if ('A' <= c && c <= 'Z') {
                if (i == 0) {
                    firstCaptial = true;
                } else {
                    useUppercase = true;
                }
            }

            if ('a' <= c && c <= 'z') {
                useLowercase = true;
            }
        }

        return (firstCaptial && useUppercase && !useLowercase) ||   // USA
               (!firstCaptial && !useUppercase && useLowercase) ||  // google
               (firstCaptial && !useUppercase && useLowercase) ||     // Google
               (firstCaptial && !useUppercase && !useLowercase); // G
    }

}
