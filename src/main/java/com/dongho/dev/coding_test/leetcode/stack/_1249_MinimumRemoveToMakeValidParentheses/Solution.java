package com.dongho.dev.coding_test.leetcode.stack._1249_MinimumRemoveToMakeValidParentheses;

import java.util.Stack;

public class Solution {

    public String minRemoveToMakeValid(String s) {
        Stack<Character> characterStack = new Stack<Character>();
        Stack<Integer> indexStack = new Stack<Integer>();
        StringBuilder builder = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                characterStack.push(c);
                indexStack.push(i);
            }

            if (c == ')') {
                if (characterStack.isEmpty() == false && characterStack.peek() == '(') {
                    characterStack.pop();
                    indexStack.pop();
                } else {
                    characterStack.push(c);
                    indexStack.push(i);
                }
            }
        }

        while (indexStack.isEmpty() == false) {
            builder.deleteCharAt(indexStack.pop());
        }

        return builder.toString();
    }

}
