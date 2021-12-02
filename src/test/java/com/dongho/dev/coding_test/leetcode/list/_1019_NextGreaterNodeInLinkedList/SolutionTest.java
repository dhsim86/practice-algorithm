package com.dongho.dev.coding_test.leetcode.list._1019_NextGreaterNodeInLinkedList;

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
    
    @Test
    public void test() {
        // given


        // when
        int[] result1 = new Solution().nextLargerNodes(getNodeList(new int[] {2, 1, 5}));
        int[] result2 = new Solution().nextLargerNodes(getNodeList(new int[] {2, 7, 4, 3, 5}));

        // then
        Assertions.assertThat(result1).containsExactly(5, 5, 0);
        Assertions.assertThat(result2).containsExactly(7, 0, 5, 5, 0);
    }

}
