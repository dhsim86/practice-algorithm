package com.dongho.dev.practice.queue;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueueTest {

    @Test
    public void enqueueTest() {
        // given
        Queue queue = new CircularArrayQueue();

        // when
        queue.enqueue(1);

        // then
        assertThat(queue.isEmpty()).isFalse();
        assertThat(queue.peek()).isEqualTo(1);
    }

    @Test
    public void enqueueTest2() {
        // given
        Queue queue = new CircularArrayQueue();

        // when
        for (int i = 0; i < 100; i++) {
            queue.enqueue(i);
        }

        // then
        assertThat(queue.isEmpty()).isFalse();
        assertThat(queue.isFull()).isTrue();

        for (int i = 0; i < 10 && queue.isEmpty() == false; i++) {
            assertThat(queue.dequeue()).isEqualTo(i);
        }
        assertThat(queue.isEmpty()).isTrue();
    }

    @Test
    public void listQueueEnqueueTest() {
        // given
        Queue queue = new ListQueue();

        // when
        queue.enqueue(1);

        // then
        assertThat(queue.isEmpty()).isFalse();
        assertThat(queue.peek()).isEqualTo(1);
    }

    @Test
    public void listQueueEnqueueTest2() {
        // given
        Queue queue = new ListQueue();

        // when
        for (int i = 0; i < 100; i++) {
            queue.enqueue(i);
        }

        // then
        assertThat(queue.isEmpty()).isFalse();

        int idx = 0;
        while(queue.isEmpty() == false) {
            assertThat(queue.dequeue()).isEqualTo(idx++);
        }
        assertThat(queue.isEmpty()).isTrue();
    }

}
