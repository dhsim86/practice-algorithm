package com.dongho.dev.coding_test.programmers.bridge_truck;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    static class BridgeTruck {
        private int weight;
        private int remainLength;

        public BridgeTruck(int weight, int remainLength) {
            this.weight = weight;
            this.remainLength = remainLength;
        }

        public void decreaseRemainLength() {
            --this.remainLength;
        }

        public boolean isRemainLengthZero() {
            return this.remainLength == 0;
        }

        public int getWeight() {
            return this.weight;
        }
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<BridgeTruck> bridgeQueue = new LinkedList<>();
        Queue<Integer> truckQueue = new LinkedList<>(
                IntStream.of(truck_weights).boxed().collect(Collectors.toList()));

        while (true) {
            if (bridgeQueue.isEmpty() && truckQueue.isEmpty()) {
                break;
            }

            bridgeQueue.stream().forEach(BridgeTruck::decreaseRemainLength);
            BridgeTruck bridgeTruck = bridgeQueue.peek();
            if (bridgeTruck != null && bridgeTruck.isRemainLengthZero()) {
                bridgeQueue.remove();
            }

            int currentBridgeWeight = bridgeQueue.stream().map(BridgeTruck::getWeight).reduce(0, (a, b) -> a + b);
            Integer truckWeight = truckQueue.peek();

            if (truckWeight != null && currentBridgeWeight + truckWeight <= weight) {
                truckQueue.remove();
                bridgeQueue.add(new BridgeTruck(truckWeight, bridge_length));
            }

            answer++;
        }

        return answer;
    }
}
