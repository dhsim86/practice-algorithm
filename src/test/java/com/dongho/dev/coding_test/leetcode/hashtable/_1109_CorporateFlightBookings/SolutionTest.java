package com.dongho.dev.coding_test.leetcode.hashtable._1109_CorporateFlightBookings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int[] result1 = new Solution().corpFlightBookings(new int[][] {
            {1, 2, 10}, {2, 3, 20}, {2, 5, 25}
        }, 5);
        int[] result2 = new Solution().corpFlightBookings(new int[][] {
            {1, 2, 10}, {2, 2, 15}
        }, 2);

        // then
        Assertions.assertThat(result1).containsExactly(10, 55, 45, 25, 25);
        Assertions.assertThat(result2).containsExactly(10, 25);
    }

}
