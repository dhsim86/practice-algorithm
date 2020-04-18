package com.dongho.dev.practice.heap;

public class Heap {

    private static final int MAX_ELEMENT = 100;
    private int[] array = new int[MAX_ELEMENT];
    private int size = 0;

    public void insert(int data) {
        int i = ++size;

        while (i != 1 && array[i / 2] < data) {
            array[i] = array[i / 2];
            i = i / 2;
        }

        array[i] = data;
    }

    public int delete() {
        int data = array[1];
        int tmp = array[size--];

        int parent = 1;
        int child = 2;

        while (child <= size) {
            if (child < size && array[child] < array[child + 1]) {
                child++;
            }

            if (tmp >= array[child]) {
                break;
            }

            array[parent] = array[child];
            parent = child;
            child = child * 2;
        }

        array[parent] = tmp;
        return data;
    }

}
