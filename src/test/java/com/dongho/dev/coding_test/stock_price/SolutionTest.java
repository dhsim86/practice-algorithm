package com.dongho.dev.coding_test.stock_price;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void solutionTest() {
        // given
        int[] prices = new int[]{1, 2, 3, 2, 3};
        Solution solution = new Solution();

        // when
        int[] result = solution.solution(prices);

        // then
        assertThat(result).containsExactly(4, 3, 1, 1, 0);
    }

}
