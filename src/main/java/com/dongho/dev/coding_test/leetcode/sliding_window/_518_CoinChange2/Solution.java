package com.dongho.dev.coding_test.leetcode.sliding_window._518_CoinChange2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    private int count = 0;
    private List<List<Integer>> combines = new ArrayList<>();

    private List<Integer> selectCoin(int current, List<Integer> coins) {
        return coins.stream()
        .filter(coin -> coin <= current)
        .collect(Collectors.toList());
    }

    private void calculate(int current, List<Integer> currentCoins, List<Integer> coins) {
        if (current < 0) {
            return;
        }

        if (current == 0) {
            currentCoins.sort(Integer::compareTo);

            if (combines.contains(currentCoins) == false) {
                count++;
                combines.add(currentCoins);
            }
            return;
        }

        List<Integer> availableCoins = selectCoin(current, coins);

        for (Integer coin : availableCoins) {
            List<Integer> newCurrentCoins = new ArrayList<>(currentCoins);
            newCurrentCoins.add(coin);
            calculate(current - coin, newCurrentCoins, coins);
        }
    }
    
    public int change(int amount, int[] coins) {
        calculate(amount, Collections.emptyList(), Arrays.stream(coins).boxed().collect(Collectors.toList()));
        return count;
    }

}
