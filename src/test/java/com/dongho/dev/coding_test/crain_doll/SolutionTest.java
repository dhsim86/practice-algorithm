package com.dongho.dev.coding_test.crain_doll;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void solutionTest() {
        // given
        int [][] board = new int[][] {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 3},
            {0, 2, 5, 0, 1},
            {4, 2, 4, 4, 2},
            {3, 5, 1, 3, 1}
        };
        int [] moves = new int[] {1, 5, 3, 5, 1, 2, 1, 4};
        Solution solution = new Solution();

        // when
        int result = solution.solution(board, moves);

        // then
        assertThat(result).isEqualTo(4);
    }

}
