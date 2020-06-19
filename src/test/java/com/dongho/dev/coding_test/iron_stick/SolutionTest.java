package com.dongho.dev.coding_test.iron_stick;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void solutionTest() {
        // given
        String arrangement = "()(((()())(())()))(())";
        Solution solution = new Solution();

        // when
        int result = solution.solution(arrangement);

        // then
        assertThat(result).isEqualTo(17);
    }

}
