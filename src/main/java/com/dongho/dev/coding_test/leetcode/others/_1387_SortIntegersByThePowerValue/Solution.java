package com.dongho.dev.coding_test.leetcode.others._1387_SortIntegersByThePowerValue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    private class PowerPair implements Comparable<PowerPair> {
        int val;
        int power;

        public PowerPair(int val) {
            this.val = val;

            int power = 0;
            while (val != 1) {
                power++;
                if (val % 2 == 0) {
                    val = val / 2;
                } else {
                    val = val * 3 + 1;
                }
            }

            this.power = power;
        }

        @Override
        public int compareTo(PowerPair other) {
            int result = Integer.compare(this.power, other.power);

            if (result != 0) {
                return result;
            }

            return Integer.compare(this.val, other.val);
        }


    }

    public int getKth(int lo, int hi, int k) {
        List<PowerPair> powerPairList = new ArrayList<>();
        
        for (int i = lo; i <= hi; i++) {
            powerPairList.add(new PowerPair(i));
        }

        powerPairList = powerPairList.stream()
            .sorted()
            .collect(Collectors.toList());

        return powerPairList.get(k - 1).val;
    }

}
