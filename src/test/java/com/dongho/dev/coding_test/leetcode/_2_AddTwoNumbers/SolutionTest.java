package com.dongho.dev.coding_test.leetcode._2_AddTwoNumbers;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given
        ListNode l1_1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2_1 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode l1_2 = new ListNode(0);
        ListNode l2_2 = new ListNode(0);

        ListNode l1_3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2_3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        Solution solution = new Solution();

        // when
        ListNode result_1 = solution.addTwoNumbers(l1_1, l2_1);
        ListNode result_2 = solution.addTwoNumbers(l1_2, l2_2);
        ListNode result_3 = solution.addTwoNumbers(l1_3, l2_3);

        // then
        assertThat(result_1.val).isEqualTo(7);
        assertThat(result_1.next.val).isEqualTo(0);
        assertThat(result_1.next.next.val).isEqualTo(8);

        assertThat(result_2.val).isEqualTo(0);

        assertThat(result_3.val).isEqualTo(8);
        assertThat(result_3.next.val).isEqualTo(9);
        assertThat(result_3.next.next.val).isEqualTo(9);
        assertThat(result_3.next.next.next.val).isEqualTo(9);
        assertThat(result_3.next.next.next.next.val).isEqualTo(0);
        assertThat(result_3.next.next.next.next.next.val).isEqualTo(0);
        assertThat(result_3.next.next.next.next.next.next.val).isEqualTo(0);
        assertThat(result_3.next.next.next.next.next.next.next.val).isEqualTo(1);
    }
    
}
