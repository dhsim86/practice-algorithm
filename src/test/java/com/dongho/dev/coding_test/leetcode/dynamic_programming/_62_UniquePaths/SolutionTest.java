package com.dongho.dev.coding_test.leetcode.dynamic_programming._62_UniquePaths;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result0 = new Solution().uniquePaths(3, 2);
        int result1 = new Solution().uniquePaths(3, 7);
        int result2 = new Solution().uniquePaths(7, 3);
        int result3 = new Solution().uniquePaths(3, 3);

        // then
        assertThat(result0).isEqualTo(3);
        assertThat(result1).isEqualTo(28);
        assertThat(result2).isEqualTo(28);
        assertThat(result3).isEqualTo(6);
    }

}
