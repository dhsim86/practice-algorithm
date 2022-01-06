package com.dongho.dev.coding_test.leetcode.breadth_firsh_search._1926_NearestExitFromEntranceInMaze;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private static class Point {
        int y;
        int x;
        
        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }

        public static boolean isBeyondBound(int r, int c, int y, int x) {
            if (y < 0 || x < 0 || y > r || x > c) {
                return true;
            }
            return false;
        }

        private static boolean isSurrounded(int r, int c, int y, int x) {
            if (y > 0 && y < r - 1 && x > 0 && x < c - 1) {
                return true;
            }
            return false;
        }
    }

    private boolean isVisitable(char[][] maze, boolean[][] visited, int y, int x) {
        int r = maze.length - 1;
        int c = maze[0].length - 1;

        return !Point.isBeyondBound(r, c, y, x) && !visited[y][x] && maze[y][x] == '.';
    }

    public int nearestExit(char[][] maze, int[] entrance) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[entrance[0]][entrance[1]] = true;

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(entrance[0], entrance[1]));

        int count = 0;

        int r = maze.length;
        int c = maze[0].length;

        while (queue.isEmpty() == false) {
            Queue<Point> nextQueue = new LinkedList<>();

            while (queue.isEmpty() == false) {
                Point point = queue.poll();

                if (!(point.y == entrance[0] && point.x == entrance[1]) && !Point.isSurrounded(r, c, point.y, point.x)) {
                    return count;
                }

                if (isVisitable(maze, visited, point.y, point.x + 1)) {
                    nextQueue.add(new Point(point.y, point.x + 1));
                    visited[point.y][point.x + 1] = true;
                }

                if (isVisitable(maze, visited, point.y + 1, point.x)) {
                    nextQueue.add(new Point(point.y + 1, point.x));
                    visited[point.y + 1][point.x] = true;
                }

                if (isVisitable(maze, visited, point.y, point.x - 1)) {
                    nextQueue.add(new Point(point.y, point.x - 1));
                    visited[point.y][point.x - 1] = true;
                }

                if (isVisitable(maze, visited, point.y - 1, point.x)) {
                    nextQueue.add(new Point(point.y - 1, point.x));
                    visited[point.y - 1][point.x] = true;
                }
            }

            queue = nextQueue;
            count++;
        }

        return -1;
    }

}
