package com.dongho.dev.coding_test.leetcode.breadth_firsh_search._1642_FurthestBuildingYouCanReach;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().furthestBuilding(new int[] {
            4, 2, 7, 6, 9, 14, 12
        }, 5, 1);
        int result2 = new Solution().furthestBuilding(new int[] {
            14, 3, 19, 3
        }, 17, 0);
        int result3 = new Solution().furthestBuilding(new int[] {
            1, 5, 1, 2, 3, 4, 10000
        }, 4, 1);

        // then
        Assertions.assertThat(result1).isEqualTo(4);
        Assertions.assertThat(result2).isEqualTo(3);
        Assertions.assertThat(result3).isEqualTo(5);
    }

}
