package com.dongho.dev.coding_test.leetcode.array._1399_CountLargestGroup;

public class Solution {

    private int getIndexOfNum(int digit) {
        String s = Integer.toString(digit);
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }

        return sum % 10;
    }

    public int countLargestGroup(int n) {
        int[] arr = new int[10];

        for (int i = 1; i <= n; i++) {
            int index = getIndexOfNum(i);
            arr[index]++;

            System.out.println("i: " + i + ", index: " + index + ", count: " + arr[index]);
        }

        int max = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                sum = 1;
            } else if (max == arr[i]) {
                sum++;
            }
        }

        return sum;
    }
}
