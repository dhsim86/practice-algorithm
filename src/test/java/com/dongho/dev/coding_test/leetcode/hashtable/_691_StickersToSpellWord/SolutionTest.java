package com.dongho.dev.coding_test.leetcode.hashtable._691_StickersToSpellWord;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        int result1 = new Solution().minStickers(
            new String[] {"with", "example", "science"},
            "thehat");
        int result2 = new Solution().minStickers(
            new String[] {"notice", "possible"},
            "basicbasic");
        int result3 = new Solution().minStickers(
            new String[] {"these", "guess", "abount", "garden", "him"}, 
            "atomher");

        // then
        assertThat(result1).isEqualTo(3);
        assertThat(result2).isEqualTo(-1);
        assertThat(result3).isEqualTo(3);
    }
    
}
