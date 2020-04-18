package com.dongho.dev.practice.queue;

public interface Queue {

    void enqueue(int data);
    int dequeue();
    int peek();

    boolean isEmpty();
    boolean isFull();

}

class CircularArrayQueue implements Queue {

    public static final int MAX_QUEUE_SIZE = 10;

    private int[] queue = new int[MAX_QUEUE_SIZE];

    private int front;
    private int rear;

    CircularArrayQueue() {
        this.front = this.rear = 0;
    }


    @Override
    public void enqueue(int data) {
        if (isFull() == false) {
            rear = (rear + 1) % MAX_QUEUE_SIZE;
            queue[rear] = data;
        }
    }

    @Override
    public int dequeue() {
        if (isEmpty() == false) {
            front = (front + 1) % MAX_QUEUE_SIZE;
            return queue[front];
        }
        return 0;
    }

    @Override
    public int peek() {
        if (isEmpty() == false) {
            return queue[(front + 1) % MAX_QUEUE_SIZE];
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public boolean isFull() {
        return front == (rear + 1) % MAX_QUEUE_SIZE;
    }
}

class ListQueue implements Queue {

    private static class Element {

        int data;
        Element next;

        public Element(int data) {
            this.data = data;
            next = null;
        }

    }

    private Element front;
    private Element rear;

    ListQueue() {
        this.front = this.rear = null;
    }

    @Override
    public void enqueue(int data) {
        if (isFull() == false) {
            Element element = new Element(data);

            if (isEmpty()) {
                front = rear = element;
            } else {
                rear.next = element;
                rear = element;
            }
        }
    }

    @Override
    public int dequeue() {
        if (isEmpty() == false) {
            Element tmp = front;
            front = front.next;

            return tmp.data;
        }
        return 0;
    }

    @Override
    public int peek() {
        if (isEmpty() == false) {
            return front.data;
        }
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return (front == null) || (rear == null);
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
