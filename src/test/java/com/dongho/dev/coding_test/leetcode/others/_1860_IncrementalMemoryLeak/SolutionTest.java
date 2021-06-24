package com.dongho.dev.coding_test.leetcode.others._1860_IncrementalMemoryLeak;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int[] result1 = new Solution().memLeak(2, 2);
        int[] result2 = new Solution().memLeak(8, 11);

        // then
        assertThat(result1).containsExactly(3, 1, 0);
        assertThat(result2).containsExactly(6, 0, 4);
    }

}
