package com.dongho.dev.coding_test.leetcode.others._432_AllOoneDataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class AllOne {

    private Map<String, Integer> hashMap;
    private SortedMap<Integer, List<String>> sortedMap;

    public AllOne() {
        hashMap = new HashMap<>();
        sortedMap = new TreeMap<>();
    }

    public void inc(String key) {
        int val = hashMap.getOrDefault(key, 0);
        List<String> list = sortedMap.get(val);

        if (list != null) {
            list.remove(key);

            if (list.isEmpty()) {
                sortedMap.remove(val);
            }
        }

        hashMap.put(key, ++val);
        list = sortedMap.get(val);

        if (list == null) {
            list = new ArrayList<>();
            sortedMap.put(val, list);
        }

        list.add(key);
    }
    
    public void dec(String key) {
        int val = hashMap.get(key);
        List<String> list = sortedMap.get(val);

        if (list != null) {
            list.remove(key);

            if (list.isEmpty()) {
                sortedMap.remove(val);
            }
        }

        --val;

        if (val == 0) {
            hashMap.remove(key);
        } else {
            hashMap.put(key, val);
            list = sortedMap.get(val);

            if (list == null) {
                list = new ArrayList<>();
                sortedMap.put(val, list);
            }

            list.add(key);
        }
    }
    
    public String getMaxKey() {
        if (sortedMap.isEmpty() == false) {
            List<String> list = sortedMap.get(sortedMap.lastKey());

            if (list.isEmpty()) {
                return "";
            } else {
                return list.get(0);
            }
        }
        return "";
    }
    
    public String getMinKey() {
        if (sortedMap.isEmpty() == false) {
            List<String> list = sortedMap.get(sortedMap.firstKey());

            if (list.isEmpty()) {
                return "";
            } else {
                return list.get(0);
            }
        }
        return "";
    }
}