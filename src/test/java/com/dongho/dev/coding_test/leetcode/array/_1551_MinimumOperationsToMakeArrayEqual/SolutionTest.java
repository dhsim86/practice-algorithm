package com.dongho.dev.coding_test.leetcode.array._1551_MinimumOperationsToMakeArrayEqual;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().minOperations(3);
        int result2 = new Solution().minOperations(6);
        int result3 = new Solution().minOperations(2);

        // then
        assertThat(result1).isEqualTo(2);
        assertThat(result2).isEqualTo(9);
        assertThat(result3).isEqualTo(1);
    }
    
}
