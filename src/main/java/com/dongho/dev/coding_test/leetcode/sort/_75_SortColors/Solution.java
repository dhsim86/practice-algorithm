package com.dongho.dev.coding_test.leetcode.sort._75_SortColors;

public class Solution {

    private void merge(int[] nums, int start, int mid, int end) {
        int[] newArray = new int[end - start];
        int index = 0;
        int i = start;
        int j = mid;

        while (i < mid && j < end) {
            if (nums[i] <= nums[j]) {
                newArray[index++] = nums[i++];
            } else {
                newArray[index++] = nums[j++];
            }
        }

        while (i < mid) {
            newArray[index++] = nums[i++];
        }

        while (j < end) {
            newArray[index++] = nums[j++];
        }

        index = 0;
        for (i = start; i < end; i++) {
            nums[i] = newArray[index++];
        }
    }

    private void mergeSort(int[] nums, int start, int end) {
        if (end - start <= 1) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(nums, start, mid);
        mergeSort(nums, mid, end);
        merge(nums, start, mid, end);
    }

    public void sortColors(int[] nums) {
        mergeSort(nums, 0, nums.length);
    }
}
