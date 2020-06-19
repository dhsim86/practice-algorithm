package com.dongho.dev.coding_test.skilltree;

public class Solution {

    public int solve(String skill, String[] skill_trees) {
        int result = 0;

        for (int i = 0; i < skill_trees.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            int phase = 0;
            boolean match = true;

            String skillTree = skill_trees[i];

            for (int j = 0; j < skillTree.length(); j++) {
                char skillCharacter = skillTree.charAt(j);

                if (skill.indexOf(skillCharacter) != -1) {
                    if (skill.charAt(phase) != skillCharacter) {
                        match = false;
                    } else {
                        phase++;
                    }
                }
            }

            if (match) {
                result++;
            }
        }
        return result;
    }

    public int solution(String skill, String[] skill_trees) {
        int answer = solve(skill, skill_trees);
        return answer;
    }
}
