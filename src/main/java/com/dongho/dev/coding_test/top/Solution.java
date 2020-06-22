package com.dongho.dev.coding_test.top;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];

        for (int i = heights.length - 1; i >= 0; i--) {
            Stack<Integer> stack = new Stack<>();
            stack.addAll(IntStream.of(heights).limit(i).boxed().collect(Collectors.toList()));

            int startTop = heights[i];
            int receivedTopIndex = 0;
            int currentTopIndex = i;

            while (stack.isEmpty() == false) {
                int currentTop = stack.pop();

                if (currentTop > startTop) {
                    receivedTopIndex = currentTopIndex;
                    break;
                }
                currentTopIndex -= 1;
            }
            answer[i] = receivedTopIndex;
        }

        return answer;
    }
}
