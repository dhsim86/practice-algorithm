package com.dongho.dev.coding_test.leetcode.hashtable._1189_MaximumNumberOfBalloons;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Solution {

    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> ballonMap = "balloon".chars()
            .mapToObj(c -> (char) c)
            .distinct()
            .collect(Collectors.toMap(c -> c, c -> 0));
            
        for (char c : text.toCharArray()) {
            if (ballonMap.get(c) != null) {
                ballonMap.put(c, ballonMap.get(c) + 1);
            }
        }

        return ballonMap.entrySet().stream()
            .map(e -> {
                if (e.getKey() == 'l' || e.getKey() == 'o') {
                    e.setValue(e.getValue() / 2);
                }
                return e;
            })
            .sorted(Comparator.comparing(Entry<Character, Integer>::getValue))
            .map(Entry::getValue)
            .findFirst()
            .orElse(0);
    }

}
