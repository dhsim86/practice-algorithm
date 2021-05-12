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
// 1 2 3 4 5 6 7 8
            if (nums[mid] < target) {
                start = mid + 1;
            }

            if (nums[mid] > target) {
                end = mid;
            }
            mid = (start + end) / 2;
        }

        return mid;
    }

}
