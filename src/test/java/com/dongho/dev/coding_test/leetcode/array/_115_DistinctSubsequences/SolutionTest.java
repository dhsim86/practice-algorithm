package com.dongho.dev.coding_test.leetcode.array._115_DistinctSubsequences;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().numDistinct("rabbbit", "rabbit");
        int result2 = new Solution().numDistinct("babgbag", "bag");
        int result3 = new Solution().numDistinct("aabb", "ab");

        // then
        assertThat(result1).isEqualTo(3);
        assertThat(result2).isEqualTo(5);
        assertThat(result3).isEqualTo(4);
    }

}
