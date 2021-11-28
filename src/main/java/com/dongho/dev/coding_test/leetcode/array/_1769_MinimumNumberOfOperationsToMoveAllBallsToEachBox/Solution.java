package com.dongho.dev.coding_test.leetcode.array._1769_MinimumNumberOfOperationsToMoveAllBallsToEachBox;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public int[] minOperations(String boxes) {
        char[] buf = boxes.toCharArray();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < boxes.length(); i++) {
            int count = 0;

            for (int j = 0; j < boxes.length(); j++) {
                if (i == j) {
                    continue;
                }

                if (buf[j] == '1') {
                    count += Math.abs(j - i);
                }
            }

            list.add(count);
        }

        return list.stream()
            .mapToInt(i -> i)
            .toArray();
    }

}
