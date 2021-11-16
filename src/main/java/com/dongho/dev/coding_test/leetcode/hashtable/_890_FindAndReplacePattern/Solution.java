package com.dongho.dev.coding_test.leetcode.hashtable._890_FindAndReplacePattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// abc
// a -> a
// b -> b
// b -> b
// abc != abb

// deq
// a -> d
// b -> e
// b -> e
// deq != dee

// a -> m
// b -> e
// b -> e
// mee == mee

// a -> a
// b -> q
// b -> q
// aqq == aqq

// a -> d
// b -> k
// b -> k
// dkd != dkk

// a -> c
// b -> (X)
// b -> (X)
// ccc != aaa

public class Solution {
    
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> results = new ArrayList<>();

        for (String word : words) {
            Map<Character, Character> patternMap = new HashMap<>();
            Map<Character, Character> reverseMap = new HashMap<>();

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char target = word.charAt(i);
                char p = pattern.charAt(i);

                if (patternMap.get(p) == null && reverseMap.get(target) == null) {
                    patternMap.put(p, target);
                    reverseMap.put(target, p);
                }
            }

            for (char p : pattern.toCharArray()) {
                builder.append(patternMap.get(p) + "");
            }

            if (word.equals(builder.toString())) {
                results.add(word);
            }
        }

        return results;
    }
}
