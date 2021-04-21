package com.dongho.dev.coding_test.programmers.function_develop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void solutionTest() {
        // given
        int[] progress = new int[]{93, 30, 55};
        int[] speeds = new int[]{1, 30, 5};
        Solution solution = new Solution();

        // when
        int[] result = solution.solution(progress, speeds);

        // then
        assertThat(result).containsExactly(2, 1);
    }

}
