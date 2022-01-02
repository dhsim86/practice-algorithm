package com.dongho.dev.coding_test.leetcode.binary_search._300_LongestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private int getIndex(List<Integer> list, int val) {
        int start = 0;
        int end = list.size();
        int mid = (start + end) / 2;

        while (end - start >= 1) {
            if (list.get(mid) == val) {
                break;
            }

            if (val < list.get(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }

            mid = (start + end) / 2;
        }

        return mid;
    }

    public int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);

        for (int i = 0; i < nums.length; i++) {
            int index = getIndex(list, nums[i]);

            if (index >= list.size()) {
                list.add(nums[i]);
            } else {
                list.set(index, nums[i]);
            }
        }

        return list.size();
    }
}
