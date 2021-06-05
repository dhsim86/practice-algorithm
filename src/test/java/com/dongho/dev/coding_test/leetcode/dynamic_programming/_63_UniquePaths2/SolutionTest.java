package com.dongho.dev.coding_test.leetcode.dynamic_programming._63_UniquePaths2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result0 = new Solution().uniquePathsWithObstacles(new int[][]{
            {0, 0, 0}, {0, 1, 0}, {0, 0, 0}
        });
        int result1 = new Solution().uniquePathsWithObstacles(new int[][]{
            {0, 1}, {0, 0}
        });
        int result2 = new Solution().uniquePathsWithObstacles(new int[][]{
            {0, 0}, {0, 1}
        });

        // then
        assertThat(result0).isEqualTo(2);
        assertThat(result1).isEqualTo(1);
        assertThat(result2).isEqualTo(0);
    }
    
}
