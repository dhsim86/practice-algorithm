package com.dongho.dev.coding_test.programmers.level3_test.격자쿼리;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        long result1 = new Solution().solution(2, 2, 0, 0, new int[][] {
            {2, 1}, {0, 1}, {1, 1}, {0, 1}, {2, 1}
        });
        long result2 = new Solution().solution(2, 5, 0, 1, new int[][] {
            {3, 1}, {2, 2}, {1, 1}, {2, 3}, {0, 1}, {2, 1}
        });

        // then
        assertThat(result1).isEqualTo(4);
        assertThat(result2).isEqualTo(2);
    }
}
