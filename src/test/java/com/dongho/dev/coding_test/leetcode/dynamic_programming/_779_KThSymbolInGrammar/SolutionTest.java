package com.dongho.dev.coding_test.leetcode.dynamic_programming._779_KThSymbolInGrammar;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().kthGrammar(1, 1);
        int result2 = new Solution().kthGrammar(2, 1);
        int result3 = new Solution().kthGrammar(2, 2);
        int result4 = new Solution().kthGrammar(3, 1);
        int result5 = new Solution().kthGrammar(30, 434991989);

        // then
        Assertions.assertThat(result1).isEqualTo(0);
        Assertions.assertThat(result2).isEqualTo(0);
        Assertions.assertThat(result3).isEqualTo(1);
        Assertions.assertThat(result4).isEqualTo(0);
        Assertions.assertThat(result5).isEqualTo(0);
    }

}
