package com.dongho.dev.coding_test.leetcode.stack._150_EvaludateReversePolishNotation;

import java.util.Stack;

public class Solution {
    
    private boolean isOperator(String op) {
        if (op.length() > 1) {
            return false;
        }

        char c = op.charAt(0);

        switch(c) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
            default:
                return false;
        }
    }

    private int operate(int i1, int i2, String op) {
        char c = op.charAt(0);

        switch(c) {
            case '+':
                return i1 + i2;
            case '-':
                return i1 - i2;
            case '*':
                return i1 * i2;
            case '/':
                return i1 / i2;
            default:
                return 0;
        }
    }
    
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int i2 = stack.pop();
                int i1 = stack.pop();

                stack.push(operate(i1, i2, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

}
