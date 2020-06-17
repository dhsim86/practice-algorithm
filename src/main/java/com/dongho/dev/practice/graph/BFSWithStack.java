package com.dongho.dev.practice.graph;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BFSWithStack {

    static class Queue {

        private static final int MAX_ELEMENT = 10000;

        private int front;
        private int rear;

        private int[] elements;

        public Queue() {
            front = rear = 0;
            elements = new int[MAX_ELEMENT];
        }

        public void enqueue(int n) {
            if (isFull() == false) {
                rear = rear + 1 % MAX_ELEMENT;
                elements[rear] = n;
            }
        }

        public int dequeue() {
            if (isEmpty() == false) {
                front = front + 1 % MAX_ELEMENT;
                return elements[front];
            }
            return 0;
        }

        public boolean isEmpty() {
            return front == rear;
        }

        public boolean isFull() {
            return (rear + 1 % MAX_ELEMENT) == front;
        }

    }

    private boolean[] visited;
    private int[][] adjacent;
    private Queue queue;

    public BFSWithStack(int vertex) {
        visited = new boolean[vertex];
        adjacent = new int[vertex][];

        for (int i = 0; i < vertex; i++){
            adjacent[i] = new int[vertex];
        }

        queue = new Queue();
    }

    public void addEdge(int vertex0, int vertex1) {
        adjacent[vertex0][vertex1] = 1;
        adjacent[vertex1][vertex0] = 1;
    }

    public void bfs(int startVertex) {
        queue.enqueue(startVertex);

        while (queue.isEmpty() == false) {
            int vertex = queue.dequeue();

            if (visited[vertex] == true) {
                continue;
            }

            visited[vertex] = true;
            log.info("{} visited", vertex);

            for (int i = 0; i < adjacent[vertex].length; i++) {
                if (adjacent[vertex][i] == 1 && visited[i] == false) {
                    queue.enqueue(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSWithStack bfs = new BFSWithStack(9);

        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 3);
        bfs.addEdge(1, 5);
        bfs.addEdge(3, 4);
        bfs.addEdge(4, 5);
        bfs.addEdge(2, 6);
        bfs.addEdge(2, 8);
        bfs.addEdge(6, 7);
        bfs.addEdge(6, 8);

        bfs.bfs(0);
    }
}
