package com.dongho.dev.coding_test.programmers.stone;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().solution(new int[] {
            2, 4, 5, 3, 2, 1, 4, 2, 5, 1
        }, 3);

        // then
        assertThat(result1).isEqualTo(3);
    }
}
