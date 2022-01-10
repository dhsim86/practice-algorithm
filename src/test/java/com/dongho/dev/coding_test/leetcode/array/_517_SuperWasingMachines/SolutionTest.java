package com.dongho.dev.coding_test.leetcode.array._517_SuperWasingMachines;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().findMinMoves(new int[] {1, 0, 5});
        int result2 = new Solution().findMinMoves(new int[] {0, 3, 0});
        int result3 = new Solution().findMinMoves(new int[] {0, 2, 0});
        int result4 = new Solution().findMinMoves(new int[] {4, 0, 0, 4});
        int result5 = new Solution().findMinMoves(new int[] {0, 0, 11, 5});
        int result6 = new Solution().findMinMoves(new int[] {0, 0, 10, 0, 0, 0, 10, 0, 0, 0});

        // then
        Assertions.assertThat(result1).isEqualTo(3);
        Assertions.assertThat(result2).isEqualTo(2);
        Assertions.assertThat(result3).isEqualTo(-1);
        Assertions.assertThat(result4).isEqualTo(2);
        Assertions.assertThat(result5).isEqualTo(8);
    }

}
