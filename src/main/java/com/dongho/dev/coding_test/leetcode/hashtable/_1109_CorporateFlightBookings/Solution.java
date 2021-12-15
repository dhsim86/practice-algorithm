package com.dongho.dev.coding_test.leetcode.hashtable._1109_CorporateFlightBookings;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {
    
    public int[] corpFlightBookings(int[][] bookings, int n) {
        SortedMap<Integer, Integer> map = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(i, 0);
        }

        for (int i = 0; i < bookings.length; i++) {
            int flightStart = bookings[i][0];
            int flightEnd = bookings[i][1];
            int seat = bookings[i][2];

            for (int j = flightStart; j <= flightEnd; j++) {
                map.put(j, map.getOrDefault(j, 0) + seat);
            }
        }

        List<Integer> seatList = new ArrayList<>();
        for (Integer flight : map.keySet()) {
            seatList.add(map.get(flight));
        }

        return seatList.stream()
            .mapToInt(i -> i)
            .toArray();
    }

}
