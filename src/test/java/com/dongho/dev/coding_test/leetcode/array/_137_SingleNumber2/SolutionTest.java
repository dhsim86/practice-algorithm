package com.dongho.dev.coding_test.leetcode.array._137_SingleNumber2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().singleNumber(new int[]{2, 2, 3, 2});
        int result2 = new Solution().singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99});

        // then
        assertThat(result1).isEqualTo(3);
        assertThat(result2).isEqualTo(99);
    }
    
}
