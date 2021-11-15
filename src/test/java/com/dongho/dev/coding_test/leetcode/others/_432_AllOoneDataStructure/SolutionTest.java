package com.dongho.dev.coding_test.leetcode.others._432_AllOoneDataStructure;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {
    
    @Test
    public void test() {
        // given
        AllOne testOne1 = new AllOne();
        AllOne testOne2 = new AllOne();

        // when

        // then
        testOne1.inc("hello");
        testOne1.inc("hello");
        assertThat(testOne1.getMaxKey()).isEqualTo("hello");
        assertThat(testOne1.getMinKey()).isEqualTo("hello");

        testOne1.inc("leet");
        assertThat(testOne1.getMaxKey()).isEqualTo("hello");
        assertThat(testOne1.getMinKey()).isEqualTo("leet");

        testOne2.inc("a");
        testOne2.inc("b");
        testOne2.inc("b");
        testOne2.inc("c");
        testOne2.inc("c");
        testOne2.inc("c");

        testOne2.dec("b");
        testOne2.dec("b");

        assertThat(testOne2.getMinKey()).isEqualTo("a");
        
        testOne2.dec("a");

        assertThat(testOne2.getMaxKey()).isEqualTo("c");
        assertThat(testOne2.getMinKey()).isEqualTo("c");

        
    }

}
