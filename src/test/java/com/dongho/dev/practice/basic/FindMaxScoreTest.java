package com.dongho.dev.practice.basic;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindMaxScoreTest {

    @Test
    public void findMaxScoreTest() {
        // given
        int[] scoreArray = new int[]{2, 3, 9, 1, 6, 8};

        // when
        int maxScore = FindMaxScore.findMaxScore(scoreArray);

        // then
        assertThat(maxScore).isEqualTo(9);
    }

}
