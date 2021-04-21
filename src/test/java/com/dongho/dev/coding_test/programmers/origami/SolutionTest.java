package com.dongho.dev.coding_test.programmers.origami;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void solutionTest() {
        // given
        Solution solution = new Solution();

        // when
        int[] result0 = solution.solution(1);
        int[] result1 = solution.solution(2);
        int[] result2 = solution.solution(3);

        // then
        assertThat(result0).containsExactly(0);
        assertThat(result1).containsExactly(0, 0, 1);
        assertThat(result2).containsExactly(0, 0, 1, 0, 0, 1, 1);
    }
}
