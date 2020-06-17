package com.dongho.dev.practice.graph;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DFS {

    private int[][] adjacentArray;
    private boolean[] visited;

    public DFS(int n) {
        adjacentArray = new int[n][];

        for (int i = 0; i < n; i++) {
            adjacentArray[i] = new int[n];
        }

        visited = new boolean[n];
    }

    void addEdge(int vertex0, int vertex1) {
        adjacentArray[vertex0][vertex1] = 1;
        adjacentArray[vertex1][vertex0] = 1;
    }

    void dfs(int startVertex) {
        visited[startVertex] = true;
        log.info("{} visited", startVertex);

        for (int i = 0; i < adjacentArray[startVertex].length; i++) {
            if (adjacentArray[startVertex][i] == 1 && visited[i] == false) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS(9);

        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 3);
        dfs.addEdge(1, 5);
        dfs.addEdge(3, 4);
        dfs.addEdge(4, 5);
        dfs.addEdge(2, 6);
        dfs.addEdge(2, 8);
        dfs.addEdge(6, 7);
        dfs.addEdge(6, 8);

        dfs.dfs(0);
    }

}
