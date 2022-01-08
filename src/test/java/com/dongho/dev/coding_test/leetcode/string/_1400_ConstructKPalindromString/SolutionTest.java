package com.dongho.dev.coding_test.leetcode.string._1400_ConstructKPalindromString;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        boolean result1 = new Solution().canConstruct("annabelles", 2);
        boolean result2 = new Solution().canConstruct("leetcode", 3);
        boolean result3 = new Solution().canConstruct("true", 4);

        // then
        Assertions.assertThat(result1).isTrue();
        Assertions.assertThat(result2).isFalse();
        Assertions.assertThat(result3).isTrue();
    }

}
