package com.dongho.dev.practice.linked_list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DoubleLinkedListTest {

    @Test
    public void addTest() {
        // given
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();

        // when
        doubleLinkedList.add(0);
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);

        // then
        assertThat(doubleLinkedList.length()).isEqualTo(3);
        assertThat(doubleLinkedList.get(0)).isEqualTo(0);
        assertThat(doubleLinkedList.get(1)).isEqualTo(1);
        assertThat(doubleLinkedList.get(2)).isEqualTo(2);
    }

    @Test
    public void addTest2() {
        // given
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();

        // when
        doubleLinkedList.add(0, 0);
        doubleLinkedList.add(1, 0);
        doubleLinkedList.add(2, 0);

        // then
        assertThat(doubleLinkedList.length()).isEqualTo(3);
        assertThat(doubleLinkedList.get(0)).isEqualTo(2);
        assertThat(doubleLinkedList.get(1)).isEqualTo(1);
        assertThat(doubleLinkedList.get(2)).isEqualTo(0);
    }

    @Test
    public void addTest3() {
        // given
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.add(0);

        // when
        doubleLinkedList.add(1, 1);
        doubleLinkedList.add(2, 1);
        doubleLinkedList.add(3, 1);

        // then
        assertThat(doubleLinkedList.length()).isEqualTo(4);
        assertThat(doubleLinkedList.get(0)).isEqualTo(0);
        assertThat(doubleLinkedList.get(1)).isEqualTo(3);
        assertThat(doubleLinkedList.get(2)).isEqualTo(2);
        assertThat(doubleLinkedList.get(3)).isEqualTo(1);
    }

    @Test
    public void addTest4() {
        // given
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.add(0);

        // when
        doubleLinkedList.add(1, 1);
        doubleLinkedList.add(2, 2);
        doubleLinkedList.add(3, 2);
        doubleLinkedList.add(4, 5);

        // then
        assertThat(doubleLinkedList.length()).isEqualTo(5);
        assertThat(doubleLinkedList.get(0)).isEqualTo(0);
        assertThat(doubleLinkedList.get(1)).isEqualTo(1);
        assertThat(doubleLinkedList.get(2)).isEqualTo(3);
        assertThat(doubleLinkedList.get(3)).isEqualTo(2);
        assertThat(doubleLinkedList.get(4)).isEqualTo(4);
    }

    @Test
    public void deleteTest() {
        // given
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.add(0);
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);

        // when
        doubleLinkedList.delete(0);

        // then
        assertThat(doubleLinkedList.length()).isEqualTo(3);
        assertThat(doubleLinkedList.get(0)).isEqualTo(1);
        assertThat(doubleLinkedList.get(1)).isEqualTo(2);
        assertThat(doubleLinkedList.get(2)).isEqualTo(3);
    }

    @Test
    public void deleteTest1() {
        // given
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.add(0);
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);

        // when
        doubleLinkedList.delete(1);

        // then
        assertThat(doubleLinkedList.length()).isEqualTo(3);
        assertThat(doubleLinkedList.get(0)).isEqualTo(0);
        assertThat(doubleLinkedList.get(1)).isEqualTo(2);
        assertThat(doubleLinkedList.get(2)).isEqualTo(3);
    }

    @Test
    public void deleteTest2() {
        // given
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.add(0);
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);

        // when
        doubleLinkedList.delete(3);

        // then
        assertThat(doubleLinkedList.length()).isEqualTo(3);
        assertThat(doubleLinkedList.get(0)).isEqualTo(0);
        assertThat(doubleLinkedList.get(1)).isEqualTo(1);
        assertThat(doubleLinkedList.get(2)).isEqualTo(2);
    }

    @Test
    public void reverseTest() {
        // given
        DoubleLinkedList<Integer> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.add(0);
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);

        // when
        doubleLinkedList.reverse();

        // then
        assertThat(doubleLinkedList.length()).isEqualTo(4);
        assertThat(doubleLinkedList.get(0)).isEqualTo(3);
        assertThat(doubleLinkedList.get(1)).isEqualTo(2);
        assertThat(doubleLinkedList.get(2)).isEqualTo(1);
        assertThat(doubleLinkedList.get(3)).isEqualTo(0);
    }
}
