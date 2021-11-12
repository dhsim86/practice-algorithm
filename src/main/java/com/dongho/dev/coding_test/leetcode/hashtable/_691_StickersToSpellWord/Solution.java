package com.dongho.dev.coding_test.leetcode.hashtable._691_StickersToSpellWord;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Solution {

    private int scanSticker(String sticker, String target) {
        int count = 0;
        for (char c: target.toCharArray()) {
            if (sticker.indexOf(c) != -1) {
                sticker.replace(c + "", "");
                count++;
            }
        }
        return count;
    }

    private String removeTarget(String target, String sticker) {
        String temp = target;

        for (char c : target.toCharArray()) {
            if (sticker.indexOf(c) != -1) {
                temp = temp.replaceFirst(c + "", "");
                sticker = sticker.replaceFirst(c + "", "");
            }
        }

        return temp;
    }

    public int minStickers(String[] stickers, String target) {
        Map<String, Integer> countMap = new HashMap<>();

        for (int i = 0; i < stickers.length; i++) {
            countMap.put(stickers[i], scanSticker(stickers[i], target));
        }
        List<String> stickerList = countMap.entrySet().stream()
            .sorted(Comparator.comparing(Entry<String, Integer>::getValue).reversed())
            .map(e -> e.getKey())
            .collect(Collectors.toList());
        countMap = new HashMap<>();

        int index = 0;

        while (target.isEmpty() == false && index < stickerList.size()) {
            String sticker = stickerList.get(index);
            String result = removeTarget(target, sticker);

            if (result.equals(target)) {
                index++;
            } else {
                countMap.put(sticker, countMap.getOrDefault(sticker, 0) + 1);
                target = result;
            }
        }

        if (target.isEmpty() == false) {
            return -1;
        }

        return countMap.values().stream()
            .reduce(0, Integer::sum);
    }

}
