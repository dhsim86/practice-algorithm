package com.dongho.dev.practice.linked_list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SinglyLinkedListTest {

    @Test
    public void addTest() {
        // given
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add(1);

        // when
        singlyLinkedList.add(2);

        // then
        assertThat(singlyLinkedList.length()).isEqualTo(2);
        assertThat(singlyLinkedList.get(0)).isEqualTo(1);
        assertThat(singlyLinkedList.get(1)).isEqualTo(2);
    }

    @Test
    public void addTest2() {
        // given
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add(1);

        // when
        singlyLinkedList.add(2, 1);
        singlyLinkedList.add(3, 0);
        singlyLinkedList.add(4, 5);

        // then
        assertThat(singlyLinkedList.length()).isEqualTo(4);
        assertThat(singlyLinkedList.get(0)).isEqualTo(3);
        assertThat(singlyLinkedList.get(1)).isEqualTo(1);
        assertThat(singlyLinkedList.get(2)).isEqualTo(2);
        assertThat(singlyLinkedList.get(3)).isEqualTo(4);
    }

    @Test
    public void addTest3() {
        // given
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add(1);

        // when
        singlyLinkedList.add(2, 1);
        singlyLinkedList.add(3, 1);
        singlyLinkedList.add(4, 1);

        // then
        assertThat(singlyLinkedList.length()).isEqualTo(4);
        assertThat(singlyLinkedList.get(0)).isEqualTo(1);
        assertThat(singlyLinkedList.get(1)).isEqualTo(4);
        assertThat(singlyLinkedList.get(2)).isEqualTo(3);
        assertThat(singlyLinkedList.get(3)).isEqualTo(2);
    }

    @Test
    public void deleteTest() {
        // given
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add(0);
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);

        // when
        singlyLinkedList.delete(1);
        singlyLinkedList.delete(1);

        // then
        assertThat(singlyLinkedList.length()).isEqualTo(2);
        assertThat(singlyLinkedList.get(0)).isEqualTo(0);
        assertThat(singlyLinkedList.get(1)).isEqualTo(3);
    }

    @Test
    public void deleteTest2() {
        // given
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add(0);
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);

        // when
        singlyLinkedList.delete(3);

        // then
        assertThat(singlyLinkedList.length()).isEqualTo(3);
        assertThat(singlyLinkedList.get(0)).isEqualTo(0);
        assertThat(singlyLinkedList.get(1)).isEqualTo(1);
        assertThat(singlyLinkedList.get(2)).isEqualTo(2);
    }


    @Test
    public void deleteTest3() {
        // given
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add(0);
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);

        // when
        singlyLinkedList.delete(5);

        // then
        assertThat(singlyLinkedList.length()).isEqualTo(4);
        assertThat(singlyLinkedList.get(0)).isEqualTo(0);
        assertThat(singlyLinkedList.get(1)).isEqualTo(1);
        assertThat(singlyLinkedList.get(2)).isEqualTo(2);
        assertThat(singlyLinkedList.get(3)).isEqualTo(3);
    }

    @Test
    public void deleteTest4() {
        // given
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add(0);
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);

        // when
        singlyLinkedList.delete(0);
        singlyLinkedList.delete(0);

        // then
        assertThat(singlyLinkedList.length()).isEqualTo(2);
        assertThat(singlyLinkedList.get(0)).isEqualTo(2);
        assertThat(singlyLinkedList.get(1)).isEqualTo(3);
    }

    @Test
    public void concatTest() {
        // given
        SinglyLinkedList<Integer> singlyLinkedList1 = new SinglyLinkedList<>();
        singlyLinkedList1.add(0);
        singlyLinkedList1.add(1);

        SinglyLinkedList<Integer> singlyLinkedList2 = new SinglyLinkedList<>();
        singlyLinkedList2.add(2);
        singlyLinkedList2.add(3);

        // when
        singlyLinkedList1.concat(singlyLinkedList2);

        // then
        assertThat(singlyLinkedList1.length()).isEqualTo(4);
        assertThat(singlyLinkedList1.get(0)).isEqualTo(0);
        assertThat(singlyLinkedList1.get(1)).isEqualTo(1);
        assertThat(singlyLinkedList1.get(2)).isEqualTo(2);
        assertThat(singlyLinkedList1.get(3)).isEqualTo(3);
    }

    @Test
    public void reverseTest() {
        // given
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.add(0);
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);

        // when
        singlyLinkedList.reverse();

        // then
        assertThat(singlyLinkedList.length()).isEqualTo(4);
        assertThat(singlyLinkedList.get(0)).isEqualTo(3);
        assertThat(singlyLinkedList.get(1)).isEqualTo(2);
        assertThat(singlyLinkedList.get(2)).isEqualTo(1);
        assertThat(singlyLinkedList.get(3)).isEqualTo(0);
    }

}
