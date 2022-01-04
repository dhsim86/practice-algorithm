package com.dongho.dev.coding_test.programmers.cote_c.서로다른자연수;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {


        // when
        boolean result1 = new Solution().solution(new int[] {5, 3, 9, 13}, 8);


        // then
        assertThat(result1).isTrue();
    }
}
