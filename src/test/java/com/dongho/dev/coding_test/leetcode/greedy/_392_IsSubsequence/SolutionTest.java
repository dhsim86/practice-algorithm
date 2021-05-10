package com.dongho.dev.coding_test.leetcode.greedy._392_IsSubsequence;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given
        String inputs1 = "abc";
        String inputt1 = "ahbgdc";

        String inputs2 = "axc";
        String inputt2 = "ahbgdc";

        Solution solution = new Solution();

        // when
        boolean result1 = solution.isSubsequence(inputs1, inputt1);
        boolean result2 = solution.isSubsequence(inputs2, inputt2);

        // then
        assertThat(result1).isTrue();
        assertThat(result2).isFalse();
    }
    
}
