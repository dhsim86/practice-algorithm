package com.dongho.dev.practice.binary_tree;

public class BinaryTree {

    static class Node {

        private int data;
        private Node left;
        private Node right;

        Node(int data) {
            this.data = data;
            this.left = right = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

    public static Node search(Node root, int data) {
        if (root == null) {
            return null;
        }

        if (root.data == data) {
            return root;
        }

        if (data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    public static Node insert(Node root, int data) {
        Node newNode = new Node(data);

        Node parent = null;
        Node target = root;

        while (target != null) {
            parent = target;

            if (target.data == data) {
                return root;
            }

            if (data < target.data) {
                target = target.left;
            } else {
                target = target.right;
            }
        }

        if (parent == null) {
            return newNode;
        }

        if (data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }

        return root;
    }

    public static Node delete(Node root, int data) {
        Node parent = null;
        Node target = root;

        while (target != null && target.data != data) {
            parent = target;

            if (data < target.data) {
                target = target.left;
            } else {
                target = target.right;
            }
        }

        if (target == null) {
            return null;
        }

        if (target.left == null && target.right == null) {
            if (parent == null) {
                return null;
            } else {
                if (parent.left == target) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            }
        } else if (target.left == null || target.right == null) {
            Node child = target.left != null ? target.left : target.right;

            if (parent.left == target) {
                parent.left = child;
            } else {
                parent.right = child;
            }
        } else {
            Node succParent = target;
            Node succ = target.right;

            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }

            if (succParent.left == succ) {
                succParent.left = succ.right;
            } else {
                succParent.right = succ.right;
            }

            target.data = succ.data;
        }

        return root;
    }

    public static String infixTraversal(Node root) {
        if (root == null) {
            return "";
        }
        String tree = "";

        tree += infixTraversal(root.left);
        tree += "[" + root.data  + "]";
        tree += infixTraversal(root.right);

        return tree;
    }

}
