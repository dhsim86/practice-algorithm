package com.dongho.dev.coding_test.leetcode.dynamic_programming._91_DecodeWays;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result0 = new Solution().numDecodings("12");
        int result1 = new Solution().numDecodings("226");
        int result2 = new Solution().numDecodings("2101");
        int result3 = new Solution().numDecodings("27");

        // then
        assertThat(result0).isEqualTo(2);
        assertThat(result1).isEqualTo(3);
        assertThat(result2).isEqualTo(1);
        assertThat(result3).isEqualTo(1);
    }
    
}
