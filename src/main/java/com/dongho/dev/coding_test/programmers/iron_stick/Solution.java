package com.dongho.dev.coding_test.programmers.iron_stick;

public class Solution {

    static class IronStickStack {

        int maxElement;
        char[] elements;
        int top;

        int stickCount;

        public IronStickStack(int maxSize) {
            maxElement = maxSize;
            elements = new char[maxElement];
            top = -1;

            stickCount = 0;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == maxElement - 1;
        }

        public int size() {
            return top + 1;
        }

        public void push(char c) {
            if (isFull() == false) {
                elements[++top] = c;
            }
        }

        public char pop() {
            if (isEmpty() == false) {
                return elements[top--];
            }
            return (char) -1;
        }

        public char peek() {
            if (isEmpty() == false) {
                return elements[top];
            }
            return (char) -1;
        }

        public boolean isClosure(char c) {
            if (isEmpty() == false && c == ')') {
                char topElement = peek();
                return topElement == '(';
            }
            return false;
        }

        public void fireLaser() {
            if (isEmpty() == false) {
                pop();
                stickCount += size();
            }
        }

        public void terminateStick(char c) {
            if (isEmpty() == false && c == ')') {
                pop();
                stickCount += 1;
            }
        }
    }

    public int solve(String arrangement) {
        IronStickStack ironStickStack = new IronStickStack(arrangement.length());

        char prev = ' ';
        for (int i = 0; i < arrangement.length(); i++) {
            char c = arrangement.charAt(i);

            if (c == '(') {
                ironStickStack.push(c);
            } else if (c == ')') {
                if (ironStickStack.isClosure(c) && prev == '(') {
                    ironStickStack.fireLaser();
                } else {
                    ironStickStack.terminateStick(c);
                }
            }
            prev = c;
        }

        return ironStickStack.stickCount;
    }


    public int solution(String arrangement) {
        int answer = solve(arrangement);
        return answer;
    }

}
