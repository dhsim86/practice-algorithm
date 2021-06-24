package com.dongho.dev.coding_test.leetcode.others._1860_IncrementalMemoryLeak;

public class Solution {

    private int memory1;
    private int memory2;

    private boolean allocate(int memory) {
        boolean allocatableMemory1 = memory1 >= memory;
        boolean allocatableMemory2 = memory2 >= memory;

        if (allocatableMemory1 && allocatableMemory2) {
            if (memory1 >= memory2) {
                memory1 -= memory;
            } else {
                memory2 -= memory;
            }
            return true;
        }

        if (allocatableMemory1) {
            memory1 -= memory;
            return true;
        }
        if (allocatableMemory2) {
            memory2 -= memory;
            return true;
        }

        return false;
    }

    public int[] memLeak(int memory1, int memory2) {
        this.memory1 = memory1;
        this.memory2 = memory2;

        int second = 0;
        do {
            second++;
        } while (allocate(second));

        return new int[] { second, this.memory1, this.memory2 };
    }
}
