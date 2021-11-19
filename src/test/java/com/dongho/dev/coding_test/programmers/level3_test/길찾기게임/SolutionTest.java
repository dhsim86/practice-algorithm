package com.dongho.dev.coding_test.programmers.level3_test.길찾기게임;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int[][] result1 = new Solution().solution(new int[][] {
            {5, 3}, {11, 5}, {13, 3}, {3, 5}, {6, 1}, {1, 3}, {8, 6}, {7, 2}, {2, 2}
        });

        // then
        assertThat(result1[0]).containsExactly(7, 4, 6, 9, 1, 8, 5, 2, 3);
        assertThat(result1[1]).containsExactly(9, 6, 5, 8, 1, 4, 3, 2, 7);
    }

}
