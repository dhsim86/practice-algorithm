package com.dongho.dev.coding_test.leetcode.sliding_window._518_CoinChange2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().change(5, new int[]{1, 2, 5});
        int result2 = new Solution().change(3, new int[]{2});
        int result3 = new Solution().change(10, new int[]{10});

        // then
        assertThat(result1).isEqualTo(4);
        assertThat(result2).isEqualTo(0);
        assertThat(result3).isEqualTo(1);
    }
    
}
// 1 2 5

// 1 2