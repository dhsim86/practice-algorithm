package com.dongho.dev.coding_test.leetcode.array._565_ArrayNesting;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().arrayNesting(new int[] {
            5, 4, 0, 3, 1, 6, 2
        });
        int result2 = new Solution().arrayNesting(new int[] {
            0, 1, 2
        });

        // then
        assertThat(result1).isEqualTo(4);
        assertThat(result2).isEqualTo(1);
    }

}
