package com.dongho.dev.coding_test.programmers.thanksgiving_day_traffic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void solutionTest() {
        // given
        String[] input0 = new String[] {
            "2016-09-15 01:00:04.001 2.0s",
            "2016-09-15 01:00:07.000 2s"
        };
        String[] input1 = new String[] {
            "2016-09-15 01:00:04.002 2.0s",
            "2016-09-15 01:00:07.000 2s"
        };
        String[] input2 = new String[] {
            "2016-09-15 20:59:57.421 0.351s",
            "2016-09-15 20:59:58.233 1.181s",
            "2016-09-15 20:59:58.299 0.8s",
            "2016-09-15 20:59:58.688 1.041s",
            "2016-09-15 20:59:59.591 1.412s",
            "2016-09-15 21:00:00.464 1.466s",
            "2016-09-15 21:00:00.741 1.581s",
            "2016-09-15 21:00:00.748 2.31s",
            "2016-09-15 21:00:00.966 0.381s",
            "2016-09-15 21:00:02.066 2.62s"
        };

        Solution solution = new Solution();

        // when
        int result0 = solution.solution(input0);
        int result1 = solution.solution(input1);
        int result2 = solution.solution(input2);

        // then
        assertThat(result0).isEqualTo(1);
        assertThat(result1).isEqualTo(2);
        assertThat(result2).isEqualTo(7);
    }

}
