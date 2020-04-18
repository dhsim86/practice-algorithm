package com.dongho.dev.practice.basic;

public class FindMaxScore {

    public static int findMaxScore(int[] scoreArray) {
        int i, tmp;

        tmp = scoreArray[0];

        for (i = 1; i < scoreArray.length; i++) {
            if (scoreArray[i] > tmp) {
                tmp = scoreArray[i];
            }
        }

        return tmp;
    }

}
