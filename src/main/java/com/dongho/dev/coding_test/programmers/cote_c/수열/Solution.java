package com.dongho.dev.coding_test.programmers.cote_c.수열;

public class Solution {
    public int solution(int []A, int S) {
        if (A.length == 0) {
            return 0;
        }

        int start = 0;
        int end = 0;
        int sum = A[end];

        int minCount = Integer.MAX_VALUE;

        while (true){
            if (start == A.length && end == A.length) {
                break;
            }

            if (start == end) {
                end++;
                continue;
            }

            if (sum >= S || end == A.length) {
                if (sum >= S) {
                    minCount = Math.min(minCount, end - start);
                }
                sum -= A[start];
                start++;
            } else if (sum < S) {
                sum += A[end];
                end++;
            }
        }

        if (minCount != Integer.MAX_VALUE) {
            return minCount;
        }

        return 0;
    }
}
