package com.dongho.dev.coding_test.programmers.top;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void solutionTest() {
        // given
        int [] height0 = new int[]{6, 9, 5, 7, 4};
        int [] height1 = new int[]{3, 9, 9, 3, 5, 7, 2};
        int [] height2 = new int[]{1, 5, 3, 6, 7, 6, 5};

        Solution solution = new Solution();

        // when
        int [] result0 = solution.solution(height0);
        int [] result1 = solution.solution(height1);
        int [] result2 = solution.solution(height2);

        // then
        assertThat(result0).containsExactly(0, 0, 2, 2, 4);
        assertThat(result1).containsExactly(0, 0, 0, 3, 3, 3, 6);
        assertThat(result2).containsExactly(0, 0, 2, 0, 0, 5, 6);
    }

}
