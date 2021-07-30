package com.dongho.dev.coding_test.leetcode.array._260_SingleNumber3;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int[] result1 = new Solution().singleNumber(new int[]{1, 2, 1, 3, 2, 5});
        int[] result2 = new Solution().singleNumber(new int[]{-1, 0});
        int[] result3 = new Solution().singleNumber(new int[]{0, 1});

        // then
        assertThat(result1).containsAnyOf(3, 5);
        assertThat(result2).containsAnyOf(-1, 0);
        assertThat(result3).containsAnyOf(1, 0);
    }

}
