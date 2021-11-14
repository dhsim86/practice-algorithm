package com.dongho.dev.coding_test.leetcode.others._1945_SumOfDigitsOfStringAfterConvert;

public class Solution {

    private String convert(String s) {
        StringBuilder builder = new StringBuilder();

        for (char c : s.toCharArray()) {
            builder.append(c - 'a' + 1 + "");
        }

        return builder.toString();
    }

    public int getLucky(String s, int k) {
        s = convert(s);

        int result = 0;

        for (int i = 0; i < k; i++) {
            result = 0;

            for (char c : s.toCharArray()) {
                result += (c - '0');
            }

            s = result + "";
        }

        return result;
    }

}
