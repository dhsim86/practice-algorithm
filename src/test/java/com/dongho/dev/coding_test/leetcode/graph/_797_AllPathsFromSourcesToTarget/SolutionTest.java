package com.dongho.dev.coding_test.leetcode.graph._797_AllPathsFromSourcesToTarget;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        List<List<Integer>> resultList1 = new Solution().allPathsSourceTarget(new int[][] {
            {1, 2}, {3}, {3}, {}
        });
        List<List<Integer>> resultList2 = new Solution().allPathsSourceTarget(new int[][] {
            {4, 3, 1}, {3, 2, 4} , {3}, {4}, {}
        });

        // then
        Assertions.assertThat(resultList1).hasSize(2);
        Assertions.assertThat(resultList1.get(0)).containsExactly(0, 1, 3);
        Assertions.assertThat(resultList1.get(1)).containsExactly(0, 2, 3);

        Assertions.assertThat(resultList2).hasSize(5);
        Assertions.assertThat(resultList2.get(0)).containsExactly(0, 4);
        Assertions.assertThat(resultList2.get(1)).containsExactly(0, 3, 4);
        Assertions.assertThat(resultList2.get(2)).containsExactly(0, 1, 3, 4);
        Assertions.assertThat(resultList2.get(3)).containsExactly(0, 1, 2, 3, 4);
        Assertions.assertThat(resultList2.get(4)).containsExactly(0, 1, 4);
    }
    
}
