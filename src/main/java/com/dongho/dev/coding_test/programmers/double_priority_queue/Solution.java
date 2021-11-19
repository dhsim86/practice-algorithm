package com.dongho.dev.coding_test.programmers.double_priority_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {

    private SortedMap<Integer, List<Integer>> map = new TreeMap<>();

    private int operate(char c, int val) {
        List<Integer> list;

        switch(c) {
        case 'D':
            Integer key = 0;

            if (map.isEmpty()) {
                return 0;
            }

            if (val == 1) {
                key = map.lastKey();
            } else {
                key = map.firstKey();
            }

            list = map.get(key);
            int value = list.get(0);
            list.remove(0);

            if (list.size() == 0) {
                map.remove(key);
            }

            return value;
        case 'I': 
            list = map.getOrDefault(val, new ArrayList<>());
            list.add(val);

            map.put(val, list);

            return 0;
        default:
            return 0;
        }
    }

    public int[] solution(String[] operations) {
        for (String command : operations) {
            String[] op = command.split(" ");
            operate(op[0].charAt(0), Integer.parseInt(op[1]));
        }

        if (map.isEmpty()) {
            return new int[] {0, 0};
        }

        int min = map.firstKey();
        int max = map.lastKey();

        return new int[] {max, min};
    }
}
