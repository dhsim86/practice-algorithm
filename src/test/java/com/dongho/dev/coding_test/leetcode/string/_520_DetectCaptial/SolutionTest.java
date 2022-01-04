package com.dongho.dev.coding_test.leetcode.string._520_DetectCaptial;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        // when

        // then
        Assertions.assertThat(new Solution().detectCapitalUse("USA")).isTrue();
        Assertions.assertThat(new Solution().detectCapitalUse("FlaG")).isFalse();
        Assertions.assertThat(new Solution().detectCapitalUse("g")).isTrue();
        Assertions.assertThat(new Solution().detectCapitalUse("G")).isTrue();
        Assertions.assertThat(new Solution().detectCapitalUse("ffffffffffffffffffffF")).isFalse();
    }

}
