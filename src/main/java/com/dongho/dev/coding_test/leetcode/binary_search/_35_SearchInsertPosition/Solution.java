package com.dongho.dev.coding_test.leetcode.binary_search._35_SearchInsertPosition;

public class Solution {
    
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int mid = (start + end) / 2;

        while (end - start >= 1) {
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = (start + end) / 2;
        }

        return mid;
    }

}
