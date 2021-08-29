package com.dongho.dev.coding_test.leetcode.array._115_DistinctSubsequences;

import java.util.Stack;

public class Solution {
    public static class CharInfo {
        char ch;
        int index;

        public CharInfo(char ch, int index) {
            this.ch = ch;
            this.index = index;
        }
    }

    private int count = 1;

    private void compute(Stack<CharInfo> stack, String s, int endIndex) {
        if (stack.isEmpty()) {
            return;
        }

        CharInfo charInfo = stack.pop();
        int originIndex = charInfo.index;

        String targetString = s.substring(0, endIndex);

        compute(stack, s, charInfo.index);

        int targetIndex;
        while ((targetIndex = targetString.indexOf(charInfo.ch, charInfo.index + 1)) != -1) {
            charInfo.index = targetIndex;
            count++;
            compute(stack, s, charInfo.index);
        }

        charInfo.index = originIndex;
        stack.push(charInfo);
    }

    public int numDistinct(String s, String t) {
        Stack<CharInfo> stack = new Stack<>();
        int prevIndex = -1;

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            int index = s.indexOf(ch, prevIndex + 1);

            if (index == -1) {
                return 0;
            }
            stack.push(new CharInfo(ch, index));
            prevIndex = index;
        }

        compute(stack, s, s.length());
        return count;
    }
}
