package com.dongho.dev.coding_test.leetcode.others._143_ReorderList;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    public void test() {
        // given
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        // when
        new Solution().reorderList(head1);
        new Solution().reorderList(head2);

        // then
        assertThat(head1.val).isEqualTo(1);
        assertThat(head1.next.val).isEqualTo(4);
        assertThat(head1.next.next.val).isEqualTo(2);
        assertThat(head1.next.next.next.val).isEqualTo(3);

        assertThat(head2.val).isEqualTo(1);
        assertThat(head2.next.val).isEqualTo(5);
        assertThat(head2.next.next.val).isEqualTo(2);
        assertThat(head2.next.next.next.val).isEqualTo(4);
        assertThat(head2.next.next.next.next.val).isEqualTo(3);
    }
    
}
