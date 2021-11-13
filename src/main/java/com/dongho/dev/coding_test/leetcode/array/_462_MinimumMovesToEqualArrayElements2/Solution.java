package com.dongho.dev.coding_test.leetcode.array._462_MinimumMovesToEqualArrayElements2;

import java.util.Arrays;

// refer: https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/discuss/1311106/Java-Soln-Completly-Explained.-%3A)
// Logic : We need to find such a point which is of the least distance from all the points.
public class Solution {

    public int minMoves2(int[] nums) {
        nums = Arrays.stream(nums)
            .sorted()
            .toArray();

        int mid = nums.length / 2;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (mid == i) {
                continue;
            }
            count += Math.abs(nums[mid] - nums[i]);
        }
        return count;
    }

}
