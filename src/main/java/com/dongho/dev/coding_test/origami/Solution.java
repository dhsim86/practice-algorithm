package com.dongho.dev.coding_test.origami;

public class Solution {

    public void fold(int start, int end, int[] answer) {
        if (end - start == 1) {
            return;
        }

        int mid = (start + end) / 2;

        if (answer[mid] != 1) {
            answer[mid] = 0;
        }

        int left = (start + mid) / 2;
        answer[left] = 0;

        int right = (mid + end) / 2;
        answer[right] = 1;

        fold(start, mid, answer);
        fold(mid + 1, end, answer);
    }

    public int[] solution(int n) {
        int[] answer = new int[(int) Math.pow(2, n) - 1];

        fold(0, (int) Math.pow(2, n) - 1, answer);
        return answer;
    }

}
