package com.dongho.dev.coding_test.leetcode.others._1945_SumOfDigitsOfStringAfterConvert;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().getLucky("zbax", 2);
        int result2 = new Solution().getLucky("iiii", 1);
        int result3 = new Solution().getLucky("leetcode", 2);

        // then
        assertThat(result1).isEqualTo(8);
        assertThat(result2).isEqualTo(36);
        assertThat(result3).isEqualTo(6);
    }

}
