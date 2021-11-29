package com.dongho.dev.coding_test.leetcode.hashtable._162_TwoSumInputArrayIsSorted;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        int[] numbers1 = {2, 7, 11, 15};
        int[] numbers2 = {2, 3, 4};
        int[] numbers3 = {-1, 0};
        int[] numbers4 = {-1000, -1, 0, 1};
        Solution solution = new Solution();

        // when
        int[] result1 = solution.twoSum(numbers1, 9);
        int[] result2 = solution.twoSum(numbers2, 6);
        int[] result3 = solution.twoSum(numbers3, -1);
        int[] result4 = solution.twoSum(numbers4, 1);

        // then
        
        assertThat(result1).containsExactlyInAnyOrder(1, 2);
        assertThat(result2).containsExactlyInAnyOrder(1, 3);
        assertThat(result3).containsExactlyInAnyOrder(1, 2);
        assertThat(result4).containsExactlyInAnyOrder(3, 4);
    }

}
