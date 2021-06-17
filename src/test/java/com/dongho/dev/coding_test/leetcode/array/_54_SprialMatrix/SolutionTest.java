package com.dongho.dev.coding_test.leetcode.array._54_SprialMatrix;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        List<Integer> result1 = new Solution().spiralOrder(new int[][] {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        });

        // then
        assertThat(result1).containsExactly(1, 2, 3, 6, 9, 8, 7, 4, 5);
    }
    
}
