package com.dongho.dev.coding_test.leetcode.breadth_firsh_search._841_KeysAndRooms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        List<List<Integer>> rooms1 = Arrays.asList(Arrays.asList(1),
            Arrays.asList(2),
            Arrays.asList(3),
            Collections.emptyList());
        List<List<Integer>> rooms2 = Arrays.asList(Arrays.asList(1, 3),
        Arrays.asList(3, 0, 1),
        Arrays.asList(2),
        Collections.emptyList());

        // when
        
        boolean result1 = new Solution().canVisitAllRooms(rooms1);
        boolean result2 = new Solution().canVisitAllRooms(rooms2);

        // then
        Assertions.assertThat(result1).isTrue();
        Assertions.assertThat(result2).isFalse();
    }

}
