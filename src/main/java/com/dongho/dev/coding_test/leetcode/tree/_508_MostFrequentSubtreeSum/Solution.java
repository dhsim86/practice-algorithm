package com.dongho.dev.coding_test.leetcode.tree._508_MostFrequentSubtreeSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}

public class Solution {

    Map<Integer, Integer> treeSumMap = new HashMap<>();

    private int getSum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int val = node.val;
        val += getSum(node.left);
        val += getSum(node.right);

        treeSumMap.put(val, treeSumMap.getOrDefault(val, 0) + 1);

        return val;
    }
    
    public int[] findFrequentTreeSum(TreeNode root) {
        getSum(root);

        SortedMap<Integer, List<Integer>> map = new TreeMap<>((v1, v2) -> Integer.compare(v2, v1));

        treeSumMap.entrySet().stream()
            .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
            .forEach(e -> {
                List<Integer> list = map.getOrDefault(e.getValue(), new ArrayList<>());
                list.add(e.getKey());
                map.put(e.getValue(), list);
            });

        return map.get(map.firstKey()).stream()
            .mapToInt(v -> v)
            .toArray();
    }

}
