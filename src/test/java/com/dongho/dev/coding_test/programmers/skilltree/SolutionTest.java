package com.dongho.dev.coding_test.programmers.skilltree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void solutionTest() {
        // given
        String skill = "CBD";
        String[] skillTrees = new String[] {
                "BACDE",
                "CBADF",
                "AECB",
                "BDA"
        };
        Solution solution = new Solution();

        // when
        int result = solution.solution(skill, skillTrees);

        // then
        assertThat(result).isEqualTo(2);
    }

}
