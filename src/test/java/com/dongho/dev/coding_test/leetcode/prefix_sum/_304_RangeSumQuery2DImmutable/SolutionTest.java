package com.dongho.dev.coding_test.leetcode.prefix_sum._304_RangeSumQuery2DImmutable;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // 0 3 3 4 8 10
        NumMatrix numMatrix = new NumMatrix(new int[][]{ 
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
        });

        // when
        int result1 = numMatrix.sumRegion(2, 1, 4, 3);
        int result2 = numMatrix.sumRegion(1, 1, 2, 2);
        int result3 = numMatrix.sumRegion(1, 2, 2, 4);

        // then
        assertThat(result1).isEqualTo(8);
        assertThat(result2).isEqualTo(11);
        assertThat(result3).isEqualTo(12);
    }

}
