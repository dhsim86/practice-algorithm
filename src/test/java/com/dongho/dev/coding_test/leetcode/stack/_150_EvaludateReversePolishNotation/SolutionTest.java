package com.dongho.dev.coding_test.leetcode.stack._150_EvaludateReversePolishNotation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when

        int result1 = new Solution().evalRPN(new String[] {
            "2","1","+","3","*"
        });
        int result2 = new Solution().evalRPN(new String[] {
            "4","13","5","/","+"
        });
        int result3 = new Solution().evalRPN(new String[] {
            "10","6","9","3","+","-11","*","/","*","17","+","5","+"
        });

        // then
        Assertions.assertThat(result1).isEqualTo(9);
        Assertions.assertThat(result2).isEqualTo(6);
        Assertions.assertThat(result3).isEqualTo(22);
    }

}
