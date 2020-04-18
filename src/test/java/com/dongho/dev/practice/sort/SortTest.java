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
        assertThat(data).containsExactlyInAnyOrder(1, 3, 4, 6, 7, 9);
    }

    @Test
    public void insertionSortTest() {
        // given
        int[] data = new int[] {9, 3, 4, 1, 7, 6};

        // when
        Sort.insertionSort(data);

        // then
        assertThat(data).containsExactlyInAnyOrder(1, 3, 4, 6, 7, 9);
    }

    @Test
    public void bubbleSortTest() {
        // given
        int[] data = new int[] {9, 3, 4, 1, 7, 6};

        // when
        Sort.bubbleSort(data);

        // then
        assertThat(data).containsExactlyInAnyOrder(1, 3, 4, 6, 7, 9);
    }

}
