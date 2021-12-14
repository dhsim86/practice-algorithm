package com.dongho.dev.coding_test.leetcode.greedy._1881_MaximumValueAfterInsertion;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        String result1 = new Solution().maxValue("99", 9);
        String result2 = new Solution().maxValue("-13", 2);
        String result3 = new Solution().maxValue("469975787943862651173569913153377", 3);

        // then
        Assertions.assertThat(result1).isEqualTo("999");
        Assertions.assertThat(result2).isEqualTo("-123");
        Assertions.assertThat(result3).isEqualTo("4699757879438632651173569913153377");
    }

}
