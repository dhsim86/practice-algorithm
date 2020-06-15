package com.dongho.dev.practice.sort;

public class Sort {

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int target = i;

            for (int j = i + 1; j < data.length; j++) {
                if (data[target] > data[j]) {
                    target = j;         // 정렬되지 않은 요소에서 가장 작은 값을 가지는 인덱
                }
            }

            // 들어가야할 인덱스의 요소와 교환
            int tmp = data[i];
            data[i] = data[target];
            data[target] = tmp;
        }
    }

    public static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int target = data[i];   // 정렬되지 않은 리스트에서 가장 앞의 값
            int j = i - 1;          // 정렬된 리스트의 마지막 값

            for (; j >= 0 && data[j] > target; j--) {
                data[j + 1] = data[j];
            }

            data[j + 1] = target;
        }
    }

    public static void bubbleSort(int[] data) {
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {   // 두개 인접 요소를 선택하여 교
                if (data[j] > data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }

    private static void merge(int[] array, int start, int mid, int end) {
        int[] sortedArray = new int[array.length];

        System.out.print("merge: ");
        for (int i = start; i < mid; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.print(" + ");
        for (int i = mid; i < end; i++) {
            System.out.print("[" + array[i] + "]");
        }
        System.out.println("");

        int target = start;
        int i = start;
        int j = mid;
        while (i < mid && j < end) {
            if (array[i] <= array[j]) {
                sortedArray[target++] = array[i++];
            } else {
                sortedArray[target++] = array[j++];
            }
        }

        while (i < mid) {
            sortedArray[target++] = array[i++];
        }
        while (j < end) {
            sortedArray[target++] = array[j++];
        }

        for (int x = start; x < end; x++) {
            array[x] = sortedArray[x];
        }
    }

    public static void mergeSort(int[] data, int start, int end) {
        if (start < end - 1) {  // 한개 요소 이
            int mid = (start + end) / 2;

            mergeSort(data , start, mid);
            mergeSort(data, mid, end);
            merge(data, start, mid, end);
        }
    }

    private static int partition(int[] data, int start, int end) {
        int pivot = start;
        int left = start;
        int right = end - 1;

        while (left < right) {
            while (left <= right && data[pivot] >= data[left]) {
                left++;
            }
            while (left <= right && data[pivot] <= data[right]) {
                right--;
            }

            if (left < right) {
                int tmp = data[left];
                data[left] = data[right];
                data[right] = tmp;
            }
        }
        int tmp = data[pivot];
        data[pivot] = data[right];
        data[right] = tmp;

        return right;
    }

    public static void quickSort(int[] data, int start, int end) {
        if (start < end - 1) {
            int pivot = partition(data, start, end);
            quickSort(data, start, pivot);
            quickSort(data, pivot + 1, end);
        }
    }

}
