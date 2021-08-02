package com.dongho.dev.coding_test.leetcode.array._462_MinimumMovesToEqualArrayElements2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().minMoves2(new int[]{1, 2, 3});
        int result2 = new Solution().minMoves2(new int[]{1, 10, 2, 9});

        int result3 = new Solution().minMoves2(new int[]{1, 0, 0, 8, 6});

        // then
        assertThat(result1).isEqualTo(2);
        assertThat(result2).isEqualTo(16);
        assertThat(result3).isEqualTo(14);
    }

}
