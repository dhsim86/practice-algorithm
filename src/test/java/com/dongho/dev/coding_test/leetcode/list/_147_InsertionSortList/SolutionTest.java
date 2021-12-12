package com.dongho.dev.coding_test.leetcode.list._147_InsertionSortList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    
    private ListNode getNodeList(int[] nums) {
        ListNode head = null;
        ListNode node = null;

        for (int i = 0; i < nums.length; i++) {
            if (head == null) {
                head = node = new ListNode(nums[i]);
                continue;
            }

            node.next = new ListNode(nums[i]);
            node = node.next;
        }

        return head;
    }

    private boolean validateListNode(ListNode result, int[] nums) {
        int index = 0;

        while (result != null) {
            if (index >= nums.length) {
                return false;
            }

            if (result.val != nums[index]) {
                return false;
            }

            result = result.next;
            index++;
        }

        if (index < nums.length) {
            return false;
        }

        return true;
    }

    @Test
    public void test() {
        // given
        ListNode head1 = getNodeList(new int[]{ 4, 2, 1, 3});

        // when
        ListNode result1 = new Solution().insertionSortList(head1);

        // then
        Assertions.assertThat(validateListNode(result1, new int[] { 1, 2, 3, 4})).isTrue();
    }

}
