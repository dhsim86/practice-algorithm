package com.dongho.dev.coding_test.leetcode.deque._2074_ReverseNodesInEvenLengthGroups;

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
        ListNode node1 = getNodeList(new int[] {5, 2, 6, 3, 9, 1, 7, 3, 8, 4});
        ListNode node2 = getNodeList(new int[] {1, 1, 0, 6, 5});

        // when
        ListNode result1 = new Solution().reverseEvenLengthGroups(node1);
        ListNode result2 = new Solution().reverseEvenLengthGroups(node2);

        // then
        Assertions.assertThat(validateListNode(result1, new int[]{5, 6, 2, 3, 9, 1, 4, 8, 3, 7})).isTrue();
        Assertions.assertThat(validateListNode(result2, new int[]{1, 0, 1, 5, 6})).isTrue();
    }

}
