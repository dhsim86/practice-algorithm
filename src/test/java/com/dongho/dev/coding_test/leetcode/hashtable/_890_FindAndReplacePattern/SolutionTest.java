package com.dongho.dev.coding_test.leetcode.hashtable._890_FindAndReplacePattern;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        List<String> results1 = new Solution().findAndReplacePattern(
            new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb");
        List<String> results2 = new Solution().findAndReplacePattern(
            new String[]{"a", "b", "c"}, "a");

        // then
        assertThat(results1).isNotEmpty().containsExactlyInAnyOrder("mee", "aqq");
        assertThat(results2).isNotEmpty().containsExactlyInAnyOrder("a", "b", "c");
    }

}
