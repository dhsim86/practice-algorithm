package com.dongho.dev.coding_test.leetcode.hashtable._771_JewelsAndStones;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().numJewelsInStones("aA", "aAAbbbb");
        int result2 = new Solution().numJewelsInStones("z", "ZZ");

        // then
        assertThat(result1).isEqualTo(3);
        assertThat(result2).isEqualTo(0);
    }
    
}
