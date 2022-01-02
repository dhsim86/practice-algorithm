package com.dongho.dev.coding_test.leetcode.dynamic_programming._416_PartitionEqualSubsetSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public boolean canPartition(int[] nums) {
        List<Integer> numList = IntStream.of(nums)
            .sorted()
            .boxed()
            .collect(Collectors.toList());

        int sum = numList.stream().reduce(0, Integer::sum);

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;

        return dp(numList, target, new HashMap<>());
    }

    private boolean dp(List<Integer> availableList, int target, Map<Integer, Boolean> map) {
        if (target == 0) {
            return true;
        }

        if (target < 0) {
            return false;
        }

        if (map.get(target) != null) {
            return map.get(target);
        }

        boolean result = false;
        for (Integer num : availableList) {
            List<Integer> newAvailableList = new ArrayList<>(availableList);
            newAvailableList.remove(num);

            result = dp(newAvailableList, target - num, map);

            if (result) {
                break;
            }
        }

        map.put(target, result);
        return result;
    }

}
