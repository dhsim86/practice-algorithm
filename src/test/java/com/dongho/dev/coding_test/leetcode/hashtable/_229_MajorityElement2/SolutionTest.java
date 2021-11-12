package com.dongho.dev.coding_test.leetcode.hashtable._229_MajorityElement2;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

public class SolutionTest {

    @Test
    public void test() {
        // given

        // when
        List<Integer> resultList1 = new Solution().majorityElement(new int[]{3, 2, 3});
        List<Integer> resultList2 = new Solution().majorityElement(new int[]{1});
        List<Integer> resultList3 = new Solution().majorityElement(new int[]{1, 2});

        // the
        assertThat(resultList1).containsExactly(3);
        assertThat(resultList2).containsExactly(1);
        assertThat(resultList3).containsExactly(1, 2);
    }
    
}
