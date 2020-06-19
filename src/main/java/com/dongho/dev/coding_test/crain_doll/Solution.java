package com.dongho.dev.coding_test.crain_doll;

public class Solution {

    class Stack {

        private int[] elements;
        private int maxSize;
        private int top;

        public Stack(int size) {
            maxSize = size;
            elements = new int[maxSize];
            top = -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == maxSize - 1;
        }

        public void push(int n) {
            if (isFull() == false) {
                elements[++top] = n;
            }
        }

        public int pop() {
            if (isEmpty() == false) {
                return elements[top--];
            }
            return -1;
        }

        public int peek() {
            if (isEmpty() == false) {
                return elements[top];
            }
            return -1;
        }

        public boolean isContinuous(int n) {
            if (isEmpty() == false) {
                int topElement = peek();
                return topElement == n;
            }
            return false;
        }
    }

    public static int getTop(int[][] board, int column) {
        int doll = 0;

        for (int i = 0; i < board.length; i++) {
            if (board[i][column - 1] != 0) {
                doll = board[i][column - 1];
                board[i][column - 1] = 0;
                return doll;
            }
        }
        return -1;
    }

    public int solve(int[][] board, int[] moves) {
        Stack stack = new Stack(board.length * board.length);
        int result = 0;

        for (int i = 0; i < moves.length; i++) {
            int doll = getTop(board, moves[i]);

            if (doll == -1) {
                continue;
            }

            if (stack.isContinuous(doll) == false) {
                stack.push(doll);
            } else {
                stack.pop();
                result += 2;
            }
        }
        return result;
    }

    public int solution(int[][] board, int[] moves) {
        int answer = solve(board, moves);
        return answer;
    }
}
