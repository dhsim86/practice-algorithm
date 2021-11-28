package com.dongho.dev.coding_test.leetcode.stack._1249_MinimumRemoveToMakeValidParentheses;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given 

        // when
        String result1 = new Solution().minRemoveToMakeValid("lee(t(c)o)de)");
        String result2 = new Solution().minRemoveToMakeValid("a)b(c)d");
        String result3 = new Solution().minRemoveToMakeValid("))((");

        // then
        Assertions.assertThat(result1).isIn("lee(t(c)o)de", "lee(t(co)de)", "lee(t(c)ode)");
        Assertions.assertThat(result2).isEqualTo("ab(c)d");
        Assertions.assertThat(result3).isEqualTo("");
    }

}
