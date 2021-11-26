package com.dongho.dev.coding_test.leetcode.binary_search._449_SerializeAndDeserializeBST;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Codec {

    private void traversePreOrder(TreeNode node, StringBuilder builder) {
        if (node == null) {
            builder.append("#" + ",");
            return;
        }

        builder.append(node.val + ",");
        traversePreOrder(node.left, builder);
        traversePreOrder(node.right, builder);
    }

    private TreeNode build(String[] values, int[] idx) {
        if (idx[0] >= values.length || values[idx[0]].equals("#")) {
            idx[0]++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(values[idx[0]]));
        idx[0]++;

        node.left = build(values, idx);
        node.right = build(values, idx);

        return node;
    }

    public String serialize(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        traversePreOrder(root, builder);

        return builder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] values = data.split(",");
        int[] idx = new int[1];
        return build(values, idx);
    }
}
