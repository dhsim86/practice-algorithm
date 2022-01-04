package com.dongho.dev.coding_test.programmers.cote_c.수강내역;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {

        // when
        String[] result1 = new Solution().solution(new String[] {
            "DS7651 A0", "CA0055 D+", "AI5543 C0", "OS1808 B-", "DS7651 B+", "AI0001 F", "DB0001 B-", "AI5543 D+", "DS7651 A+", "OS1808 B-"
        });

        // then
        assertThat(result1).containsExactly(new String[] {
            "DS7651 A+", "OS1808 B-", "DB0001 B-", "AI5543 C0", "CA0055 D+", "AI0001 F"
        });
    }

}
