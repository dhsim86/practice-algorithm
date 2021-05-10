package com.dongho.dev.coding_test.programmers.bridge_truck;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void SolutionTest() {
        // given
        int bridgeLength= 2;
        int weight = 10;
        int[] truckWeights = new int[]{7, 4, 5, 6};

        Solution solution = new Solution();

        // when
        int result = solution.solution(bridgeLength, weight, truckWeights);

        // then
        assertThat(result).isEqualTo(8);
    }

}
