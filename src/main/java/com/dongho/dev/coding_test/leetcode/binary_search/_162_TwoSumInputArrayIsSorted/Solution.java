package com.dongho.dev.coding_test.leetcode.binary_search._162_TwoSumInputArrayIsSorted;

public class Solution {
    
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (end - start > 1) {
            int sum = numbers[start] + numbers[end];

            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                break;
            }
        }
        return new int[]{start + 1, end + 1};
    }

}
