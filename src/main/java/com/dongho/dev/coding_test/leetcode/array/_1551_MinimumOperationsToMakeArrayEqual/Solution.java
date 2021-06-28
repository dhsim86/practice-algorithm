package com.dongho.dev.coding_test.leetcode.array._1551_MinimumOperationsToMakeArrayEqual;

public class Solution {

    private int[] initArray(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (2 * i) + 1;
        }

        return arr;
    }

    private void doOperation(int[] arr, int x, int y) {
        arr[x] -= 1;
        arr[y] += 1;
    }

    public int minOperations(int n) {
        if (n <= 1) {
            return 0;
        }

        int[] arr = initArray(n);
        int count = 0;

        int mid = n / 2;
        int left;
        int right;

        int remain = n % 2;
        if (remain == 0) {
            doOperation(arr, mid, mid - 1);
            count++;
            
            left = Math.max(0, mid - 2);
            right = Math.min(mid + 1, n - 1);
        } else {
            left = Math.max(0, mid - 1);
            right = Math.min(mid + 1, n - 1);
        }


        while (left >= 0 && right < n) {
            while (arr[left] != arr[right]) {
                doOperation(arr, right, left);
                count++;
            }
            left -= 1;
            right++;
        }

        return count;
    }
}
