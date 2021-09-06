package com.dongho.dev.coding_test.leetcode.others._1945_SumOfDigitsOfStringAfterConvert;

public class Solution {

    private String transform(String str) {
        int value = 0;

        for (int i = 0; i < str.length(); i++) {
            value += str.charAt(i) - '0';
        }

        return String.valueOf(value);
    }

    public int getLucky(String s, int k) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            builder.append(s.charAt(i) - 'a' + 1);
        }

        s = builder.toString();

        for (int i = 0; i < k; i++) {
            s = transform(s);
        }

        return Integer.parseInt(s);
    }

}
