package com.dongho.dev.coding_test.leetcode.greedy._765_CouplesHoldingHands;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().minSwapsCouples(new int[]{0, 2, 1, 3});
        int result2 = new Solution().minSwapsCouples(new int[]{3, 2, 0, 1});
        int result3 = new Solution().minSwapsCouples(new int[]{5, 6, 4, 0, 2, 1, 9, 3, 8, 7, 11, 10});

        // then
        assertThat(result1).isEqualTo(1);
        assertThat(result2).isEqualTo(0);
        assertThat(result3).isEqualTo(4);
        
        // 5, 6, 4, 0, 2, 1, 9, 3, 8, 7, 11, 10
        // 5, 4, 6, 0, 2, 1, 9, 3, 8, 7, 11, 10   // 1
        // 5, 4, 6, 7, 2, 1, 9, 3, 8, 0, 11, 10    // 2
        // 5, 4, 6, 7, 2, 3, 9, 1, 8, 0, 11, 10     // 3
        // 5, 4, 6, 7, 2, 3, 9, 8, 1, 0, 11, 10     // 4
    }

}
