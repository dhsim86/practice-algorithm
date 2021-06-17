package com.dongho.dev.coding_test.leetcode.array._54_SprialMatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private boolean[][] isVisited;

    private static class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static Position getNextPosition(Direction cur, Position curPosition) {
            int x = curPosition.x;
            int y = curPosition.y;

            switch (cur) {
            case LEFT:
                return new Position(++x, y);
            case DOWN:
                return new Position(x, ++y);
            case RIGHT:
                return new Position(--x, y);
            case UP:
                return new Position(x, --y);
            }
            return null;
        }
    }

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

        public static NextInfo getNextInfo(Direction cur, boolean[][] isVisited, int curX, int curY) {
            Direction nextDirection = cur.getNext();

            Position next = Position.getNextPosition(cur, new Position(curX, curY));

            if (next.x >= 0 && next.y >= 0 && next.x < isVisited[0].length && next.y < isVisited.length && isVisited[next.y][next.x] == false) {
                return new NextInfo(cur, next.x, next.y);
            }

            next = Position.getNextPosition(nextDirection, new Position(curX, curY));

            if (next.x >= 0 && next.y >= 0 && next.x < isVisited[0].length && next.y < isVisited.length && isVisited[next.y][next.x] == false) {
                return new NextInfo(nextDirection, next.x, next.y);
            }

            return null;
        }
    }

    private static class NextInfo {
        Direction direction;
        int x;
        int y;

        public NextInfo(Direction direction, int x, int y) {
            this.direction = direction;
            this.x = x;
            this.y = y;
        }
    }
    
    public List<Integer> spiralOrder(int[][] matrix) {
        isVisited = new boolean[matrix.length][matrix[0].length];
        List<Integer> list = new ArrayList<>();

        NextInfo next = new NextInfo(Direction.LEFT, 0, 0);

        do {
            isVisited[next.y][next.x] = true;
            list.add(matrix[next.y][next.x]);

            next = Direction.getNextInfo(next.direction, isVisited, next.x, next.y);
        } while (next != null);

        return list;
    }

}
