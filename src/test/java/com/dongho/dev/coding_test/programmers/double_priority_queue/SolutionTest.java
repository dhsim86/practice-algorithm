package com.dongho.dev.coding_test.programmers.double_priority_queue;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        /*
        int[] result1 = new Solution().solution(new String[] {
            "I 16", "D 1"
        });
        int[] result2 = new Solution().solution(new String[] {
            "I 7","I 5","I -5","D -1"
        });
        int[] result3 = new Solution().solution(new String[] {
            "I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"
        });*/
        int[] result4 = new Solution().solution(new String[] {
            "I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"
        });

        // then
        //assertThat(result1).containsExactly(0, 0);
        //assertThat(result2).containsExactly(7, 5);
        //assertThat(result3).containsExactly(333, -45);
        assertThat(result4).containsExactly(0, 0);
    }
    
}
