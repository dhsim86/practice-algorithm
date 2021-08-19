package com.dongho.dev.coding_test.leetcode.hashtable._721_AccountsMerge;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        List<List<String>> accounts1 = new ArrayList<>();
        accounts1.add(Arrays.asList("John","johnsmith@mail.com","john_newyork@mail.com"));
        accounts1.add(Arrays.asList("John","johnsmith@mail.com","john00@mail.com"));
        accounts1.add(Arrays.asList("Mary","mary@mail.com"));
        accounts1.add(Arrays.asList("John","johnnybravo@mail.com"));

        // when
        List<List<String>> result1 = new Solution().accountsMerge(accounts1);

        // then
        assertThat(result1.size()).isEqualTo(3);
    }

}
