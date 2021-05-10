package com.dongho.dev.coding_test.leetcode.divide_and_conquer._169_MajorityElement;

class Info {
    private static int countInRange(int[] nums, int start, int end, int num) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (num == nums[i]) {
                count++;
            }
        }
        return count;
    }

    public static int getMajorInfo(int[] nums, int start, int end) {    
        if (end - start <= 1) {
            return nums[start];
        }

        int mid = (start + end) / 2;
        int left = getMajorInfo(nums, start, mid);
        int right = getMajorInfo(nums, mid, end);

        if (left == right) {
            return left;
        }

        int leftCount = countInRange(nums, start, end, left);
        int rightCount = countInRange(nums, start, end, right);

        return leftCount >= rightCount ? left : right;
    }
}

public class Solution {

    public int majorityElement(int[] nums) {
        return Info.getMajorInfo(nums, 0, nums.length);
    }
    
}
