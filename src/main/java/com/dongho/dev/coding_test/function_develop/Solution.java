package com.dongho.dev.coding_test.function_develop;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private boolean isEnd(int[] progresses) {
        for (int i = 0; i < progresses.length; i++) {
            if (progresses[i] < 100) {
                return false;
            }
        }
        return true;
    }

    private boolean isDeployable(int[] progress, int index) {
        for (int i = index; i >= 0; i--) {
            if (progress[i] < 100) {
                return false;
            }
        }
        return true;
    }

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();

        int preDeploy = 0;
        int deploy = 0;

        while (isEnd(progresses) == false) {
            for (int i = deploy; i < progresses.length; i++) {
                progresses[i] += speeds[i];
            }

            for (int i = deploy; i < progresses.length; i++) {
                if (isDeployable(progresses, i)) {
                    deploy++;
                }
            }

            if (preDeploy != deploy) {
                answerList.add(deploy - preDeploy);
                preDeploy = deploy;
            }
        }

        return answerList.stream().mapToInt(i -> i).toArray();
    }

}
