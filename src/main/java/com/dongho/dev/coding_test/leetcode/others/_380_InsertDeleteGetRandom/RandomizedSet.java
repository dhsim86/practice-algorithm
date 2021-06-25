package com.dongho.dev.coding_test.leetcode.others._380_InsertDeleteGetRandom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {

    private List<Integer> list;
    private Map<Integer, Integer> map;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain
     * the specified element.
     */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        list.add(val);
        map.put(val, list.size() - 1);

        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified
     * element.
     */
    public boolean remove(int val) {
        if (map.containsKey(val) == false) {
            return false;
        }

        int index = map.get(val);

        if (index == list.size() - 1) {
            map.remove(val);
            list.remove(index);
            return true;
        }

        int lastValue = list.get(list.size() - 1);
        map.remove(lastValue);
        map.remove(val);
        
        map.put(lastValue, index);

        list.set(index, lastValue);
        list.remove(list.size() - 1);

        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
