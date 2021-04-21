package com.dongho.dev.coding_test.programmers.thanksgiving_day_traffic;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Solution {

    static class LogData implements Comparable {
        private LocalDateTime startTime;
        private LocalDateTime endTime;

        public LogData(LocalDateTime endTime, Duration second) {
            this.endTime = endTime;
            this.startTime = endTime.minus(second).plus(Duration.ofMillis(1));
        }

        public boolean isInRange(LogData logData) {
            return (logData.startTime.minusSeconds(1).isBefore(endTime));
        }

        @Override
        public int compareTo(Object o) {
            if (o instanceof LogData) {
                LogData other = (LogData) o;

                if (startTime.isBefore(other.startTime)) {
                    return -1;
                } else if (startTime.isAfter(other.startTime)) {
                    return 1;
                }
            }

            return 0;
        }
    }

    public LogData parseLogData(String log) {
        String[] tokens = log.split(" ");

        LocalDateTime datetime = LocalDateTime.parse(tokens[0] + " " + tokens[1],
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));

        String[] secondTokens = tokens[2].replace("s", "").split("\\.");
        Duration second = Duration.ofSeconds(Integer.parseInt(secondTokens[0]));

        if (secondTokens.length > 1) {
            int milliSeconds = 0;
            int multiple = 100;

            for (int i = 0; i < secondTokens[1].length(); i++) {
                milliSeconds += (secondTokens[1].charAt(i) - '0') * multiple;
                multiple /= 10;
            }

            second = second.plus(Duration.ofMillis(milliSeconds));
        }

        return new LogData(datetime, second);
    }

    public int solution(String[] lines) {
        List<LogData> logDataList = new ArrayList<>();
        for (int i = 0; i < lines.length; i++) {
            logDataList.add(parseLogData(lines[i]));
        }
        Collections.sort(logDataList);

        PriorityQueue<LogData> logQueue = new PriorityQueue<>((o1, o2) -> {
            if (o1.endTime.isBefore(o2.endTime)) {
                return -1;
            } else if (o1.endTime.isAfter(o2.endTime)) {
                return 1;
            } else {
                return 0;
            }
        });

        int max = 0;

        for (int i = 0; i < logDataList.size(); i++) {
            LogData logData = logDataList.get(i);

            while (logQueue.isEmpty() == false) {
                LogData firstLogData = logQueue.peek();

                if (firstLogData.isInRange(logData) == false) {
                    logQueue.poll();
                } else {
                    break;
                }
            }

            logQueue.add(logData);
            max = logQueue.size() > max ? logQueue.size() : max;
        }

        return max;
    }
}
