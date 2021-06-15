package com.dongho.dev.coding_test.leetcode.tree._951_FlipEquivalentBinaryTrees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution {

    private void flip(TreeNode node) {
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
    }

    private boolean isFlipable(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null && node2 != null) {
            return false;
        }

        if (node1 != null && node2 == null) {
            return false;
        }

        if (node1.val != node2.val) {
            return false;
        }

        if (node1.left != null) {
            if (node2.right == null) {
                return false;
            }

            if (node1.left.val != node2.right.val) {
                return false;
            }
        } else {
            if (node2.right != null) {
                return false;
            }
        }

        if (node1.right != null) {
            if (node2.left == null) {
                return false;
            }

            if (node1.right.val != node2.left.val) {
                return false;
            }
        } else {
            if (node2.left != null) {
                return false;
            }
        }

        return true;
    }

    private boolean isEqual(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null && node2 != null) {
            return false;
        }

        if (node1 != null && node2 == null) {
            return false;
        }

        if (node1.val != node2.val) {
            return false;
        }

        if (node1.left != null) {
            if (node2.left == null) {
                return false;
            }

            if (node1.left.val != node2.left.val) {
                return false;
            }
        } else {
            if (node2.left != null) {
                return false;
            }
        }

        if (node1.right != null) {
            if (node2.right == null) {
                return false;
            }

            if (node1.right.val != node2.right.val) {
                return false;
            }
        } else {
            if (node2.right != null) {
                return false;
            }
        }

        return true;
    }

    public boolean intraverseAndFlip(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }

        if (isEqual(node1, node2)) {
            return intraverseAndFlip(node1.left, node2.left) &&
                intraverseAndFlip(node1.right, node2.right);
        } else {
            if (isFlipable(node1, node2) == false) {
                return false;
            }
    
            flip(node2);
    
            return intraverseAndFlip(node1.left, node2.left) &&
                intraverseAndFlip(node1.right, node2.right);
        }
    }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return intraverseAndFlip(root1, root2);
    }
}
