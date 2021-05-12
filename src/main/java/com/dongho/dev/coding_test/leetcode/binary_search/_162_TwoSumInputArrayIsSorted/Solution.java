package com.dongho.dev.coding_test.leetcode.binary_search._162_TwoSumInputArrayIsSorted;

public class Solution {
    
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length;
        int mid = (start + end) / 2;

        while (end - start >= 1) {
            if (numbers[mid] == target) {
                break;
            }

            if (numbers[mid] < target) {
                start = mid + 1;
            }
            if (numbers[mid] > target) {
                end = mid;
            }
            mid = (start + end) / 2;
        }

        int first = 0;
        int second = mid >= numbers.length ? mid - 1 : mid;

        // [ -1, 0] / -1
        if (first == second) {
            second += 1;
        }

        while (numbers[first] + numbers[second] != target) {
            if (numbers[first] + numbers[second] < target) {
                first++;
            }
            if (numbers[first] + numbers[second] > target) {
                second--;
            }
        }

        return new int[] {first + 1, second + 1};
    }

}
