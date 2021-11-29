package com.dongho.dev.coding_test.leetcode.graph._797_AllPathsFromSourcesToTarget;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private int[][] graph;
    private boolean[] visited;
    private List<List<Integer>> resultList;

    private void visit(List<Integer> nodeList, int cur, int target) {
        if (cur == target) {
            nodeList.add(cur);
            resultList.add(nodeList);
        }

        if (visited[cur]) {
            return;
        }

        visited[cur] = true;

        int[] candidates = graph[cur];

        for (int i = 0; i < candidates.length; i++) {
            List<Integer> list = new ArrayList<>(nodeList);
            list.add(cur);

            visit(list, candidates[i], target);
        }

        visited[cur] = false;
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        this.graph = graph;
        this.visited = new boolean[graph.length];
        this.resultList = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        
        visit(list, 0, graph.length - 1);
        return resultList;
    }
}
