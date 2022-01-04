package com.dongho.dev.coding_test.leetcode.tree._1377_FrogPositionAfterTSeconds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private double[] probabilites;
    private boolean[] visited;
    private Map<Integer, List<Integer>> treeMap;
    private int maxSecond;
    private int target;

    private void traverse(int current, int second, double probability) {
        if (maxSecond <= second) {
            return;
        }
        if (visited[current]) {
            return;
        }

        visited[current] = true;
        second++;

        if (current != target && visited[target]) {
            probabilites[target] = 0;
        }

        List<Integer> connectedList = treeMap.get(current);

        if (connectedList != null) {
            for (int connectedVertex : connectedList) {
                if (!visited[connectedVertex]) {
                    probabilites[connectedVertex] = probability / connectedList.size();
                    traverse(connectedVertex, second, probabilites[connectedVertex]);
                }
            }
        }

        second--;
        visited[current] = false;
    }

    public double frogPosition(int n, int[][] edges, int t, int target) {
        this.probabilites = new double[n + 1];
        this.probabilites[1] = 1;
        this.visited = new boolean[n + 1];
        this.treeMap = new HashMap<>();
        this.maxSecond = t;
        this.target = target;

        for (int i = 0; i < edges.length; i++) {
            Arrays.sort(edges[i]);

            int parent = edges[i][0];
            int child = edges[i][1];

            List<Integer> childList = treeMap.getOrDefault(parent, new ArrayList<>());
            childList.add(child);
            treeMap.put(parent, childList);
        }

        traverse(1, 0, 1);
        return probabilites[target];
    }

}
