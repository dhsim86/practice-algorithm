package com.dongho.dev.coding_test.leetcode.array._1399_CountLargestGroup;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        //int result = new Solution().countLargestGroup(13);
        int result2 = new Solution().countLargestGroup(38);

        // then
        //assertThat(result).isEqualTo(4);
        assertThat(result2).isEqualTo(7);
    }
    
}
