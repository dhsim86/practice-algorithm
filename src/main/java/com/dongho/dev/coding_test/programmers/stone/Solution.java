package com.dongho.dev.coding_test.programmers.stone;

class Solution {
/*
    private int step(int[] stones, int current, int step) {
        int max = Math.min(stones.length, current + step);
        int i = current;

        for ( ; i < max; i++) {
            if (stones[i] > 0) {
                return i;
            }
        }

        if (i >= stones.length) {
            return Integer.MAX_VALUE;
        }

        return -1;
    }*/

    public int solution(int[] stones, int k) {
        int answer = 0;
        int prevIndex = 0;
        
        out: while (true) {
            for (int i = 0; i < stones.length; i++) {
                stones[i]--;

                if (stones[i] >= 0) {
                    if (i - prevIndex > k) {
                        break out;
                    }
                    prevIndex = i;
                }
            }
            answer++;
        }
/*
        int step = 1;

        out: while (true) {
            for (int i = 0; i < stones.length; ) {
                int index = step(stones, i, step);

                if (index == -1) {
                    if (step >= k) {
                        break out;
                    } else {
                        step = step + 1;
                        continue;
                    }
                } else if (index == Integer.MAX_VALUE) {
                    break;
                }

                stones[index]--;
                i = index + 1;
            }

            answer++;
        }
*/
        return answer;
    }
}
