package com.dongho.dev.practice.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PowerTest {

    @Test
    public void powerTest() {
        // given
        int n = 5;

        // when
        double result_0 = Power.iterPower(2, 5);
        double result_1 = Power.recurPower(2, 5);

        // then
        assertThat(result_0).isEqualTo(Double.valueOf(32.0d));
        assertThat(result_0).isEqualTo(result_1);
    }

}
