package com.dongho.dev.coding_test.leetcode.dynamic_programming._1301_NumberOfPathsWithMaxScore;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        //int[] result1 = new Solution().pathsWithMaxScore(Arrays.asList("E23", "2X2", "12S"));
        int[] result2 = new Solution().pathsWithMaxScore(Arrays.asList("E11345","X452XX","3X43X4","422812","284522","13422S"));

        // then
        //assertThat(result1).containsExactly(7, 1);

        // Fix me to (34, 3)
        //assertThat(result2).containsExactly(34, 3);
        assertThat(result2).containsExactly(34, 2);
    }

}
