package com.dongho.dev.coding_test.leetcode.greedy._1881_MaximumValueAfterInsertion;

public class Solution {

    /*
    public String maxValue(String n, int x) {
        boolean isNegative = n.charAt(0) == '-' ? true : false;
        BigInteger max = new BigInteger(n + x);
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '-') {
                continue;
            }

            int c = n.charAt(i) - '0';

            if (isNegative == false) {
                if (x > c) {
                    builder.append(n.substring(0, i));
                    builder.append(x);
                    builder.append(n.substring(i, n.length()));
                    break;
                }
            } else {
                if (x < c) {
                    builder.append(n.substring(0, i));
                    builder.append(x);
                    builder.append(n.substring(i, n.length()));
                    break;
                }
            }
        }
        
        if (builder.length() == 0) {
            return max.toString();
        }

        return max.max(new BigInteger(builder.toString())).toString();
    }
    */

    public String maxValue(String n, int x) {
        boolean isNegative = n.charAt(0) == '-' ? true : false;

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '-') {
                continue;
            }

            int c = n.charAt(i) - '0';

            if (isNegative == false) {
                if (x > c) {
                    return n.substring(0, i) + x + n.substring(i, n.length());
                }
            } else {
                if (x < c) {
                    return n.substring(0, i) + x + n.substring(i, n.length());
                }
            }
        }

        return n + x;
    }

}
