package com.dongho.dev.coding_test.leetcode.others._1387_SortIntegersByThePowerValue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    private static class PowerValue implements Comparable<PowerValue> {

        private int val;
        private int power;

        private static int calculatePower(int val) {
            int count = 0;

            while (val != 1) {
                if (val % 2 == 0) {
                    val /= 2;
                } else {
                    val = val * 3 + 1;
                }
                count++;
            }
            return count;
        }

        public PowerValue(int val) {
            this.val = val;
            this.power = calculatePower(val);
        }

        @Override
        public int compareTo(PowerValue o) {
            int result = Integer.compare(power, o.power);
            if (result == 0) {
                return Integer.compare(val, o.val);
            }
            return result;
        }

    }

    public int getKth(int lo, int hi, int k) {
        Queue<PowerValue> queue = new PriorityQueue<>();

        for (int i = lo; i <= hi; i++) {
            queue.add(new PowerValue(i));
        }

        for (int i = 0; i < k; i++) {
            PowerValue powerValue = queue.poll();

            if (i == k - 1) {
                return powerValue.val;
            }
        }

        return 0;
    }

}
