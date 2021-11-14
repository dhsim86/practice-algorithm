package com.dongho.dev.coding_test.leetcode.array._1551_MinimumOperationsToMakeArrayEqual;

public class Solution {

/*

    1 3 5 7 9 11 

    */

    public int minOperations(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = 2 * i + 1;
        }

        //

        int mid = n / 2;
        int midValue = array[mid];
        int count = 0;

        if (n % 2 == 0) {
            midValue -= 1;
            count++;
        }

        for (int i = mid + 1; i < array.length; i++) {
            count += array[i] - midValue;
        }

        return count;
    }

}
