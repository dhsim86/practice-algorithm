package com.dongho.dev.coding_test.leetcode.array._54_SprialMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private enum Direction {
        LEFT,
        DOWN,
        RIGHT,
        UP;

        public Direction getNext() {
            switch(this) {
            case LEFT:
                return DOWN;
            case DOWN:
                return RIGHT; 
            case RIGHT:
                return UP;
            case UP:
                return LEFT;
            }
            return null;
        }
    }

    private static class Point {
        int y;
        int x;
        Direction direction;

        Point(int y, int x, Direction direction) {
            this.y = y;
            this.x = x;
            this.direction = direction;
        }

        private boolean isReachable(boolean[][] visited) {
            if (this.y < 0 || this.y >= visited.length ||
                this.x < 0 || this.x >= visited[0].length) {
                return false;
            }

            if (visited[this.y][this.x]) {
                return false;
            }

            return true;
        }

        public Point calculateNext() {
            switch(this.direction) {
            case LEFT:
                return new Point(y, x + 1, this.direction);
            case DOWN:
                return new Point(y + 1, x, this.direction);
            case RIGHT:
                return new Point(y, x - 1, this.direction);
            case UP:
                return new Point(y - 1, x, this.direction);
            }
            return null;
        }
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int visitedCount = 0;
        int maxCount = matrix.length * matrix[0].length;
        Point point = new Point(0, 0, Direction.LEFT);

        while (visitedCount < maxCount) {
            visited[point.y][point.x] = true;
            result.add(matrix[point.y][point.x]);
            visitedCount++;

            Point next = point.calculateNext();

            if (next.isReachable(visited) == false) {
                point.direction = point.direction.getNext();
                next = point.calculateNext();
            }

            point = next;
        }

        return result;
    }

}
