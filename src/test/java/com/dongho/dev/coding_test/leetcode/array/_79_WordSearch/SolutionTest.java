package com.dongho.dev.coding_test.leetcode.array._79_WordSearch;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given

        // when
        boolean result1 = new Solution().exist(new char[][] {
            {'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}
        }, "ABCCED");

        boolean result2 = new Solution().exist(new char[][] {
            {'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}
        }, "SEE");

        boolean result3 = new Solution().exist(new char[][] {
            {'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}
        }, "ABCB");

        // then
        Assertions.assertThat(result1).isTrue();
        Assertions.assertThat(result2).isTrue();
        Assertions.assertThat(result3).isFalse();
    }

}
