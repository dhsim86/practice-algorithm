package com.dongho.dev.practice.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {

    @Test
    public void factTest() {
        // given

        // when
        int result = Factorial.fact(5);

        // then
        assertThat(result).isEqualTo(120);
    }

}
