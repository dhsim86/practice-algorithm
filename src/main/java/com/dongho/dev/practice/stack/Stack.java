package com.dongho.dev.practice.stack;

public interface Stack {

    boolean isEmpty();
    boolean isFull();
    void push(int element);

    int pop();
    int peek();

}

class ArrayStack implements Stack {

    private static final int MAX_COUNT = 100;

    private int[] stack = new int[MAX_COUNT];
    private int pos = -1;

    @Override
    public boolean isEmpty() {
        return pos == -1;
    }

    @Override
    public boolean isFull() {
        return pos == MAX_COUNT - 1;
    }

    @Override
    public void push(int element) {
        if (isFull() == false) {
            stack[++pos] = element;
        }
    }

    @Override
    public int pop() {
        if (isEmpty() == false) {
            return stack[pos--];
        }
        return 0;
    }

    @Override
    public int peek() {
        if (isEmpty() == false) {
            return stack[pos];
        }
        return 0;
    }
}

class ListStack implements Stack {

    private static class Element {
        private int data;
        private Element next;

        Element(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Element top;

    ListStack() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void push(int data) {
        Element element = new Element(data);

        element.next = top;
        top = element;
    }

    @Override
    public int pop() {
        if (isEmpty() == false) {
            int data = top.data;
            top = top.next;

            return data;
        }
        return 0;
    }

    @Override
    public int peek() {
        if (isEmpty() == false) {
            return top.data;
        }
        return 0;
    }
}

class BracketMatch {

    public static boolean isMatch(String expression) {

        Stack stack = new ArrayStack();

        for (int i = 0; i < expression.length(); i++) {
            char character = expression.charAt(i);

            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
                continue;
            } else if (character == ')' || character == ']' || character == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char oppositeCharacter = (char)stack.pop();

                if ((character == ')' && oppositeCharacter != '(') ||
                    (character == ']' && oppositeCharacter != '[') ||
                    (character == '}' && oppositeCharacter != '{')) {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static int postfixOperate(String postfixExpression) {

        Stack stack = new ArrayStack();

        for (int i = 0; i < postfixExpression.length(); i++) {
            char character = postfixExpression.charAt(i);

            if (character == '+' || character == '-' || character == '*' || character == '/') {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = 0;

                switch (character) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                }

                stack.push(result);
            } else {
                stack.push(Integer.parseInt(String.valueOf(character)));
            }
        }
        return stack.pop();
    }

    private static int priority(char operator) {

        switch (operator) {
            case '(':
            case ')':
                return 0;
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }

        return -1;
    }

    public static String infixToPostfix(String infixExpression) {
        Stack stack = new ArrayStack();
        StringBuilder postfixExpressionBuilder = new StringBuilder();

        for (int i = 0; i < infixExpression.length(); i++) {
            char character = infixExpression.charAt(i);

            if (character == '+' || character == '-' || character == '*' || character == '/') {
                while (true) {
                    if (stack.isEmpty() == false && priority(character) <= priority((char)stack.peek())) {
                        postfixExpressionBuilder.append(Character.valueOf((char)stack.pop()));
                    } else {
                        break;
                    }
                }

                stack.push(character);
            } else if (character == '(') {
                stack.push(character);
            } else if (character == ')') {

                while('(' != stack.peek()) {
                    postfixExpressionBuilder.append(Character.valueOf((char)stack.pop()));
                }
                stack.pop();
            } else {
                postfixExpressionBuilder.append(character);
            }
        }

        while(stack.isEmpty() == false) {
            postfixExpressionBuilder.append(Character.valueOf((char)stack.pop()));
        }

        return postfixExpressionBuilder.toString();
    }

}
