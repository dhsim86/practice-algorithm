package com.dongho.dev.practice.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HanoiTest {

    @Test
    public void moveTest() {
        // given
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] tmp = new int[10];
        int[] to = new int[10];

        // when
        Hanoi.move(10, array, tmp, to);

        // then
        assertThat(array).containsOnly(0);
        assertThat(tmp).containsOnly(0);
        assertThat(to).containsExactly(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

}
