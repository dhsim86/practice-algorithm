package com.dongho.dev.coding_test.programmers.cote_c.수열;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {

        // when
        int result1 = new Solution().solution(new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5, 6}, 20);

        // then
        assertThat(result1).isEqualTo(3);
    }
    
}
