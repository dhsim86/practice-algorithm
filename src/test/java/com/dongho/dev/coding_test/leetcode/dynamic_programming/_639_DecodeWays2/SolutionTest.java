package com.dongho.dev.coding_test.leetcode.dynamic_programming._639_DecodeWays2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().numDecodings("*");
        int result2 = new Solution().numDecodings("1*");
        int result3 = new Solution().numDecodings("2*");
        int result4 = new Solution().numDecodings("**");
        int result5 = new Solution().numDecodings("*1");

        // then
        assertThat(result1).isEqualTo(9);
        assertThat(result2).isEqualTo(18);
        assertThat(result3).isEqualTo(15);
        assertThat(result4).isEqualTo(96);
        assertThat(result5).isEqualTo(11);
    }
    
}
