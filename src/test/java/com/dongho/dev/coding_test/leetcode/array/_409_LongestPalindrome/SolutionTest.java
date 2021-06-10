package com.dongho.dev.coding_test.leetcode.array._409_LongestPalindrome;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when

        // then
        assertThat(new Solution().longestPalindrome("a")).isEqualTo(1);
        assertThat(new Solution().longestPalindrome("bb")).isEqualTo(2);
        assertThat(new Solution().longestPalindrome("ccc")).isEqualTo(3);
    }

}
