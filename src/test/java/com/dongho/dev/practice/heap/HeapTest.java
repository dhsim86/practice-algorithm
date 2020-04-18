package com.dongho.dev.practice.heap;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HeapTest {

    @Test
    public void insertAndDeleteTest() {
        // given
        Heap heap = new Heap();

        // when
        heap.insert(10);
        heap.insert(11);
        heap.insert(9);
        heap.insert(7);
        heap.insert(8);

        // then
        assertThat(heap.delete()).isEqualTo(11);
        assertThat(heap.delete()).isEqualTo(10);
        assertThat(heap.delete()).isEqualTo(9);
        assertThat(heap.delete()).isEqualTo(8);
        assertThat(heap.delete()).isEqualTo(7);
    }

}
