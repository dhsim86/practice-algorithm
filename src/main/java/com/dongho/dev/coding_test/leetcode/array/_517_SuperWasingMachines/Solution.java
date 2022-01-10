package com.dongho.dev.coding_test.leetcode.array._517_SuperWasingMachines;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Solution {
    
    public int findMinMoves(int[] machines) {
        TreeMap<Integer, List<Integer>> treeMap =  new TreeMap<>((v1, v2) -> Integer.compare(v2, v1));

        int sum = 0;
        int count = 0;

        for (int i = 0; i < machines.length; i++) {
            List<Integer> indexList = treeMap.getOrDefault(machines[i], new ArrayList<>());

            indexList.add(i);
            treeMap.put(machines[i], indexList);

            sum += machines[i];
        }

        if (sum % machines.length != 0) {
            return -1;
        }

        do {
            int max = treeMap.firstKey();
            int min = treeMap.lastKey();

            if (max == min) {
                break;
            }

            List<Integer> maxIndexList = treeMap.get(max);
            List<Integer> minIndexList = treeMap.get(min);

            int maxLoop = Math.min(maxIndexList.size(), minIndexList.size());
            boolean[] moved = new boolean[machines.length];

            Loop: for (int i = 0; i < maxLoop; i++) {
                int maxIndex = maxIndexList.get(maxIndexList.size() - 1);
                int minIndex = minIndexList.get(minIndexList.size() - 1);

                int start = Math.min(minIndex, maxIndex);
                int end = Math.max(minIndex, maxIndex);

                for (int j = start; j <= end; j++) {
                    if (moved[j]) {
                        break Loop;
                    }

                    moved[j] = true;
                }

                maxIndexList.remove(maxIndexList.size() - 1);
                minIndexList.remove(minIndexList.size() - 1);

                List<Integer> moveMaxIndexList = treeMap.getOrDefault(max - 1, new ArrayList<>());
                List<Integer> moveMinIndexList = treeMap.getOrDefault(min + 1, new ArrayList<>());
    
                moveMaxIndexList.add(maxIndex);
                moveMinIndexList.add(minIndex);
    
                treeMap.put(max - 1, moveMaxIndexList);
                treeMap.put(min + 1, moveMinIndexList);
            }
            
            count++;


            if (maxIndexList.isEmpty()) {
                treeMap.remove(max);
            }

            if (minIndexList.isEmpty()) {
                treeMap.remove(min);
            }

        } while(true);

        return count;
    }

}
