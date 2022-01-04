package com.dongho.dev.coding_test.programmers.cote_c.수강내역;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {

    private static class SubjectInfo implements Comparable<SubjectInfo> {

        private enum Grade {
            APlus("A+", 12),
            A("A0", 11),
            AMinus("A-", 10),
            BPlus("B+", 9),
            B("B0", 8),
            BMinus("B-", 7),
            CPlus("C+", 6),
            C("C0", 5),
            CMinus("C-", 4),
            DPlus("D+", 3),
            D("D0", 2),
            DMinus("D-", 1),
            Failed("F", 0);

            private String gradeValue;
            private int record;

            private Grade(String gradeValue, int record) {
                this.gradeValue = gradeValue;
                this.record = record;
            }

            private static Map<String, Grade> map;

            static {
                map = new HashMap<>();

                for (Grade grade : Grade.values()) {
                    map.put(grade.gradeValue, grade);
                }
            }

            private static Grade from(String gradeValue) {
                return map.get(gradeValue);
            }
        }

        private String subject;
        private Grade grade;
        private int order;

        private SubjectInfo(String subject, String grade, int order) {
            this.subject = subject;
            this.grade = Grade.from(grade);
            this.order = order;
        }

        @Override
        public int compareTo(SubjectInfo o) {
            int result = Integer.compare(o.grade.record, grade.record);

            if (result == 0) {
                return Integer.compare(order, o.order);
            }

            return result;
        }
    }

    private Map<String, SubjectInfo> recordMap;

    public String[] solution(String[] grades) {
        recordMap = new HashMap<>();

        int order = 0;

        for (String grade : grades) {
            String token[] = grade.split(" ");

            String subject = token[0];
            String gradeValue = token[1];

            SubjectInfo info = recordMap.get(subject);

            if (info == null) {
                recordMap.put(subject, new SubjectInfo(subject, gradeValue, order));
            } else {
                SubjectInfo newInfo = new SubjectInfo(subject, gradeValue, order);

                if (info.grade.record < newInfo.grade.record) {
                    recordMap.put(subject, newInfo);
                }
            }
            order++;
        }
        
        List<String> answerList = recordMap.values().stream()
            .sorted()
            .map(s -> s.subject + " " + s.grade.gradeValue)
            .collect(Collectors.toList());

        return answerList.toArray(new String[answerList.size()]);
    }
}
