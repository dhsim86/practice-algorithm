package com.dongho.dev.coding_test.leetcode.dynamic_programming._980_UniquePaths3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().uniquePathsIII(new int[][] {
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 2, -1}
        });

        int result2 = new Solution().uniquePathsIII(new int[][] {
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 2}
        });
        
        int result3 = new Solution().uniquePathsIII(new int[][] {
            {0, 1},
            {2, 0}
        });

        // then
        assertThat(result1).isEqualTo(2);
        assertThat(result2).isEqualTo(4);
        assertThat(result3).isEqualTo(0);
    }
    
}
