package com.dongho.dev.coding_test.leetcode.hashtable._383_RansomNote;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        boolean result1 = new Solution().canConstruct("a", "b");
        boolean result2 = new Solution().canConstruct("aa", "ab");
        boolean result3 = new Solution().canConstruct("aa", "aab");

        // then
        assertThat(result1).isFalse();
        assertThat(result2).isFalse();
        assertThat(result3).isTrue();
    }

}
