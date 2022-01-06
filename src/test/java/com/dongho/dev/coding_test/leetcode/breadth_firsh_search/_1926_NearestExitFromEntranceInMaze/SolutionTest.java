package com.dongho.dev.coding_test.leetcode.breadth_firsh_search._1926_NearestExitFromEntranceInMaze;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().nearestExit(new char[][] {
            {'+', '+', '.', '+'}, {'.', '.', '.' ,'+'},{ '+', '+', '+', '.'}
        }, new int[] {1, 2});

        int result2 = new Solution().nearestExit(new char[][] {
            {'+', '+', '+'}, {'.', '.', '.'},{ '+', '+', '+'}
        }, new int[] {1, 0});

        int result3 = new Solution().nearestExit(new char[][] {
            {'.', '+'}
        }, new int[] {0, 0});

        // then
        Assertions.assertThat(result1).isEqualTo(1);
        Assertions.assertThat(result2).isEqualTo(2);
        Assertions.assertThat(result3).isEqualTo(-1);
    }

}
