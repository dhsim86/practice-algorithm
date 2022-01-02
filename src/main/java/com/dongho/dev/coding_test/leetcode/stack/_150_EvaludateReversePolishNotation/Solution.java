package com.dongho.dev.coding_test.leetcode.stack._150_EvaludateReversePolishNotation;

import java.util.Stack;

public class Solution {
    
    private boolean isOperator(String token) {
        if (token.length() > 1) {
            return false;
        }
        
        char c = token.charAt(0);

        switch(c) {
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
    }

    private int calculate(String token, int operand1, int operand2) {
        char c = token.charAt(0);

        switch (c) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '/':
                return operand1 / operand2;
            case '*':
                return operand1 * operand2;
        }
        return 0;
    }
    
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                stack.push(calculate(token, operand1, operand2));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

}
