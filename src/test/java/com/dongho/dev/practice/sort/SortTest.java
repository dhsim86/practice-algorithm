package com.dongho.dev.practice.sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortTest {

    @Test
    public void selectionSortTest() {
        // given
        int[] data = new int[] {1, 3, 4, 9, 7, 6};

        // when
        Sort.selectionSort(data);

        // then
        assertThat(data).containsExactly(1, 3, 4, 6, 7, 9);
    }

    @Test
    public void insertionSortTest() {
        // given
        int[] data = new int[] {9, 3, 4, 1, 7, 6};

        // when
        Sort.insertionSort(data);

        // then
        assertThat(data).containsExactly(1, 3, 4, 6, 7, 9);
    }

    @Test
    public void bubbleSortTest() {
        // given
        int[] data = new int[] {9, 3, 4, 1, 7, 6};

        // when
        Sort.bubbleSort(data);

        // then
        assertThat(data).containsExactly(1, 3, 4, 6, 7, 9);
    }

    @Test
    public void mergeSortTest() {
        // given
        int[] data = new int[] {9, 3, 4, 1, 7, 1, 10, 11, 2, 6, 12, 5, 8, 14, 15, 13};

        // when
        Sort.mergeSort(data, 0, data.length);

        // then
        assertThat(data).containsExactly(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
    }

    @Test
    public void quickSortTest() {
        // given
        int[] data = new int[] {9, 3, 4, 1, 7, 1, 10, 11, 2, 6, 12, 5, 8, 14, 15, 13};

        // when
        Sort.quickSort(data, 0, data.length);

        // then
        assertThat(data).containsExactly(1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
    }

}
