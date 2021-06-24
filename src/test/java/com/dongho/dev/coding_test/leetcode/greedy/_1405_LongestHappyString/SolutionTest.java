package com.dongho.dev.coding_test.leetcode.greedy._1405_LongestHappyString;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        String result1 = new Solution().longestDiverseString(1, 1, 7);
        String result2 = new Solution().longestDiverseString(2, 2, 1);
        String result3 = new Solution().longestDiverseString(7, 1, 0);

        // then
        assertThat(result1).isIn("ccaccbcc", "ccbccacc");
        assertThat(result2).isIn("aabbc", "ababc");
        assertThat(result3).isEqualTo("aabaa");
    }
    
}
