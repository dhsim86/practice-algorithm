package com.dongho.dev.coding_test.leetcode.others._1387_SortIntegersByThePowerValue;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().getKth(12, 15, 2);
        int result2 = new Solution().getKth(1, 1, 1);
        int result3 = new Solution().getKth(7, 11, 4);

        // then
        assertThat(result1).isEqualTo(13);
        assertThat(result2).isEqualTo(1);
        assertThat(result3).isEqualTo(7);
    }

}
