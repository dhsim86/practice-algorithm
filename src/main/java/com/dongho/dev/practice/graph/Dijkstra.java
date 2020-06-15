package com.dongho.dev.practice.graph;

public class Dijkstra {

    private static final int MAX_COUNT = 7;
    private static final int NONE = -1;

    private int[][] weight = new int[][] {
            {0, 7, Short.MAX_VALUE, Short.MAX_VALUE, 3, 10, Short.MAX_VALUE},
            {7, 0, 4, 10, 2, 6, Short.MAX_VALUE},
            {Short.MAX_VALUE, 4, 0, 2, Short.MAX_VALUE, Short.MAX_VALUE, Short.MAX_VALUE},
            {Short.MAX_VALUE, 10, 2, 0, 11, 9, 4},
            {3, 2, Short.MAX_VALUE, 11, 0, Short.MAX_VALUE, 5},
            {10, 6, Short.MAX_VALUE, 9, Short.MAX_VALUE, 0, Short.MAX_VALUE},
            {Short.MAX_VALUE, Short.MAX_VALUE, Short.MAX_VALUE, 4, 5, Short.MAX_VALUE, 0}
        };
    private int[] distance = new int[MAX_COUNT];
    // distance를 변경시킨 정점 기록
    private int[] result = new int[MAX_COUNT];
    private boolean[] visited = new boolean[MAX_COUNT];

    Dijkstra() {
        for (int i = 0; i < result.length; i++) {
            result[i] = NONE;
        }
    }

    private int getMinVertexByDistance() {
        // 방문하지 않은 정점들 중 가장 최소값을 가지는 정점 선택
        int minIndex = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < MAX_COUNT; i++) {
            if (visited[i] == true) {
                continue;
            }

            if (minValue > distance[i]) {
                minValue = distance[i];
                minIndex = i;
            }
        }

        visited[minIndex] = true;
        return minIndex;
    }

    private void calculateDistance(int to) {
        // distance 재계
        for(int i = 0; i < MAX_COUNT; i++) {
            if (distance[i] > weight[to][i] + distance[to]) {
                distance[i] = weight[to][i] + distance[to];
                result[i] = to;
            }
        }
    }

    public void calculate(int start) {
        visited[start] = true;
        for (int i = 0; i < MAX_COUNT; i++) {
            distance[i] = weight[start][i]; // 시작 정점으로부터 distance 초기화
        }
        // 방문하지 않은 인접 정점으로부터 가장 최소로 연결된 정점을 선택하여 방문 후 distance 재계산
        for(int i = 0; i < MAX_COUNT - 1; i++) {
            int minVertex = getMinVertexByDistance();
            calculateDistance(minVertex);
        }
    }

    public String getMinimumPath(int from, int to) {
        int path[] = new int[MAX_COUNT];
        int i = 0;

        int current = to;
        while (current != from) {
            if (result[current] == NONE) {
                path[i++] = from;
                break;
            } else {
                path[i++] = current = result[current];
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("[" + from + "]");
        for (int j = MAX_COUNT - 1; j >= 0; j--) {
            if (path[j] == from) {
                continue;
            }
            stringBuilder.append("[" + path[j] + "]");
        }
        stringBuilder.append("[" + to + "]");

        return stringBuilder.toString();
    }

}
