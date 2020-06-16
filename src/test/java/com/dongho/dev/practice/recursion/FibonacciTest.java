package com.dongho.dev.practice.recursion;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class FibonacciTest {

    @Test
    public void fibTest() {
        // given

        // when
        int result = Fibonacci.fib(10);

        // then
        assertThat(result).isEqualTo(55);
    }

    @Test
    public void fibMemoizationTest() {
        // given
        Fibonacci.initFibMemoizationList(10);

        // when
        int result = Fibonacci.fibMemoization(10);

        // then
        assertThat(result).isEqualTo(55);
    }

    @Test
    public void fibPerfTest() {
        // given
        Fibonacci.initFibMemoizationList(45);


        // when
        long start0 = System.currentTimeMillis();
        int result0 = Fibonacci.fib(45);
        long end0 = System.currentTimeMillis();

        long start1 = System.currentTimeMillis();
        int result1 = Fibonacci.fibMemoization(45);
        long end1 = System.currentTimeMillis();

        // then
        assertThat(result0).isEqualTo(result1);
        log.info("fib {} ms", end0 - start0);
        log.info("fib with memoization {} ms", end1 - start1);
    }

}
