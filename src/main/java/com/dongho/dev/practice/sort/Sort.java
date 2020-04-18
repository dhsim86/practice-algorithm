package com.dongho.dev.practice.sort;

public class Sort {

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int target = i;

            for (int j = i + 1; j < data.length; j++) {
                if (data[target] > data[j]) {
                    target = j;
                }
            }

            int tmp = data[i];
            data[i] = data[target];
            data[target] = tmp;
        }
    }

    public static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int target = data[i];
            int j = i - 1;

            for (; j >= 0 && data[j] > target; j--) {
                data[j + 1] = data[j];
            }

            data[j + 1] = target;
        }
    }

    public static void bubbleSort(int[] data) {
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }

}
