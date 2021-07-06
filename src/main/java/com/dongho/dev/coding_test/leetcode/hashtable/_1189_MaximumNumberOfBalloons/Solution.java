package com.dongho.dev.coding_test.leetcode.hashtable._1189_MaximumNumberOfBalloons;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private String TEMPLATE = "balloon";
    private Map<Character, Integer> map = new HashMap<>();

    public int maxNumberOfBalloons(String text) {
        for (char c : TEMPLATE.toCharArray()) {
            map.put(c, 0);
        }
        
        for (int i = 0; i < text.length(); i++) {
            Character c = text.charAt(i);
            
            if (TEMPLATE.contains(c.toString())) {
                Integer count = map.get(c);

                if (count != null) {
                    map.put(c, count + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }

        Integer minCount = map.values().stream()
            .min(Integer::compare)
            .get();
        Integer lCount = map.get('l');
        Integer oCount = map.get('o');

        int count = Math.min(minCount, lCount / 2);
        count = Math.min(count, oCount / 2);

        return count;
    }
}
