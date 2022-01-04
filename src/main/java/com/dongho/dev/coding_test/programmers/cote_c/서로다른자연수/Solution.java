package com.dongho.dev.coding_test.programmers.cote_c.서로다른자연수;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean solution(int[] arr, int n) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(n - arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }

        return false;
    }
}
