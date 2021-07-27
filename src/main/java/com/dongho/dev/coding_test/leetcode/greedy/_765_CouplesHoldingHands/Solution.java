package com.dongho.dev.coding_test.leetcode.greedy._765_CouplesHoldingHands;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private Map<Integer, Integer> map = new HashMap<>();
    private Map<Integer, Integer> reverseMap = new HashMap<>();

    private void swap(int idx1, int idx2) {
        int target1 = map.get(idx1);
        int target2 = map.get(idx2);

        map.put(idx1, target2);
        map.put(idx2, target1);

        reverseMap.put(target2, idx1);
        reverseMap.put(target1, idx2);
    }

    private boolean isNeedNoChange(int target) {
        int idx = reverseMap.get(target);
        int coupleIdx = calculateCoupleIdx(idx);

        int couple = map.get(coupleIdx);
        return calculateCoupleValue(target) == couple;
    }

    private int calculateCoupleIdx(int idx) {
        return idx % 2 == 0 ? idx + 1 : idx - 1;
    }

    private int calculateCoupleValue(int target) {
        if (target % 2 == 0) {
            return target + 1;
        }
        return target - 1;
    }
    
    public int minSwapsCouples(int[] row) {
        int count = 0;

        for (int i = 0; i < row.length; i++) {
            map.put(i, row[i]);
            reverseMap.put(row[i], i);
        }

        for (int i = 0; i < row.length; i += 2) {
            if (isNeedNoChange(map.get(i)) == false) {
                int couple = calculateCoupleValue(map.get(i));
                int coupleIdx = reverseMap.get(couple);
                int nextIdx = calculateCoupleIdx(i);

                swap(nextIdx, coupleIdx);
                count++;
            }
        }

        return count;
    }

}
