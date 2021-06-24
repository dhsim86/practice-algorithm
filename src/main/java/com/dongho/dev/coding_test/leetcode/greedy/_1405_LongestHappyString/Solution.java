package com.dongho.dev.coding_test.leetcode.greedy._1405_LongestHappyString;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Solution {

    private Map<Character, Integer> map = new HashMap<>();

    private void init(int a, int b, int c) {
        map.put('a', a);
        map.put('b', b);
        map.put('c', c);
    }

    private Character getNextCharacters(char current, int currerntCount) {
        Optional<Character> candidateOpt = map.entrySet().stream()
            .filter(e -> e.getKey() != (currerntCount < 2 ? ' ' : current))
            .sorted((e1, e2) -> Integer.compare(e1.getValue(), e2.getValue()) * -1)
            .findFirst()
            .map(e -> e.getKey());

        if (candidateOpt.isPresent()) {
            Character key = candidateOpt.get();
            int count = map.get(key);

            if (count > 0) {
                map.put(key, count - 1);
                return key;
            }
        }
        return null;
    }
    
    public String longestDiverseString(int a, int b, int c) {
        init(a, b, c);
        StringBuilder builder = new StringBuilder();
        Character current = ' ';
        Character next = ' ';

        int count = 0;

        while ((next = getNextCharacters(current, count)) != null) {
            if (current.equals(next)) {
                count++;
            } else {
                count = 1;
            }

            if (count >= 3) {
                break;
            }

            builder.append(next);
            current = next;
        }

        return builder.toString();
    }

}
