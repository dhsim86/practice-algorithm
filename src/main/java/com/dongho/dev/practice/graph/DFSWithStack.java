package com.dongho.dev.practice.graph;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DFSWithStack {

    static class Stack {

        private static final int MAX_ELEMENT = 1000;

        private int top;
        private int[] elements;

        public Stack() {
            top = -1;
            elements = new int[MAX_ELEMENT];
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

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == MAX_ELEMENT -1;
        }

    }

    private boolean[] visited;
    private int[][] adjacent;
    private Stack stack;

    public DFSWithStack(int vertexSize) {
        visited = new boolean[vertexSize];
        adjacent = new int[vertexSize][];

        for (int i = 0; i < vertexSize; i++) {
            adjacent[i] = new int[vertexSize];
        }

        stack = new Stack();
    }

    public void addEdge(int vertex0, int vertex1) {
        adjacent[vertex0][vertex1] = 1;
        adjacent[vertex1][vertex0] = 1;
    }

    public void dfs(int startVertex) {
        visited[startVertex] = true;
        stack.push(startVertex);

        log.info("{} visited", startVertex);

        while(stack.isEmpty() == false) {
            int vertex = stack.pop();

            for (int i = 0; i < adjacent[vertex].length; i++) {
                if (adjacent[vertex][i] == 1 && visited[i] == false) {
                    visited[i] = true;
                    stack.push(i);
                    log.info("{} visited", i);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS(9);

        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 3);
        dfs.addEdge(1, 5);
        dfs.addEdge(3, 4);
        dfs.addEdge(4, 5);
        dfs.addEdge(2, 6);
        dfs.addEdge(2, 8);
        dfs.addEdge(6, 7);
        dfs.addEdge(6, 8);

        dfs.dfs(0);
    }

}
