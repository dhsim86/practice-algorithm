package com.dongho.dev.practice.binary_tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryTreeTest {

    @Test
    public void insertAndSearchTest() {
        // given

        // when
        BinaryTree.Node root = BinaryTree.insert(null, 7);
        root = BinaryTree.insert(root, 3);
        root = BinaryTree.insert(root, 11);
        root = BinaryTree.insert(root, 1);
        root = BinaryTree.insert(root, 5);
        root = BinaryTree.insert(root, 9);
        root = BinaryTree.insert(root, 15);
        root = BinaryTree.insert(root, 2);
        root = BinaryTree.insert(root, 4);
        root = BinaryTree.insert(root, 6);
        root = BinaryTree.insert(root, 8);
        root = BinaryTree.insert(root, 10);
        root = BinaryTree.insert(root, 12);
        root = BinaryTree.insert(root, 13);
        root = BinaryTree.insert(root, 14);

        // then
        assertThat(BinaryTree.infixTraversal(root)).isEqualTo("[1][2][3][4][5][6][7][8][9][10][11][12][13][14][15]");
        assertThat(BinaryTree.search(root, 3).getData()).isEqualTo(3);
        assertThat(BinaryTree.search(root, 7).getData()).isEqualTo(7);
    }

    @Test
    public void leafDeleteTest() {
        // given
        BinaryTree.Node root = BinaryTree.insert(null, 7);
        root = BinaryTree.insert(root, 3);
        root = BinaryTree.insert(root, 11);
        root = BinaryTree.insert(root, 1);
        root = BinaryTree.insert(root, 5);
        root = BinaryTree.insert(root, 9);
        root = BinaryTree.insert(root, 15);
        root = BinaryTree.insert(root, 2);
        root = BinaryTree.insert(root, 4);
        root = BinaryTree.insert(root, 6);
        root = BinaryTree.insert(root, 8);
        root = BinaryTree.insert(root, 10);
        root = BinaryTree.insert(root, 12);
        root = BinaryTree.insert(root, 13);
        root = BinaryTree.insert(root, 14);

        // when
        BinaryTree.delete(root, 6);
        // then
        assertThat(BinaryTree.infixTraversal(root)).isEqualTo("[1][2][3][4][5][7][8][9][10][11][12][13][14][15]");
        assertThat(BinaryTree.search(root, 6)).isNull();
    }

    @Test
    public void oneChildNodeDeleteTest() {
        // given
        BinaryTree.Node root = BinaryTree.insert(null, 7);
        root = BinaryTree.insert(root, 3);
        root = BinaryTree.insert(root, 11);
        root = BinaryTree.insert(root, 1);
        root = BinaryTree.insert(root, 5);
        root = BinaryTree.insert(root, 9);
        root = BinaryTree.insert(root, 15);
        root = BinaryTree.insert(root, 2);
        root = BinaryTree.insert(root, 4);
        root = BinaryTree.insert(root, 6);
        root = BinaryTree.insert(root, 8);
        root = BinaryTree.insert(root, 10);
        root = BinaryTree.insert(root, 12);
        root = BinaryTree.insert(root, 13);
        root = BinaryTree.insert(root, 14);

        // when
        BinaryTree.delete(root, 1);
        // then
        assertThat(BinaryTree.infixTraversal(root)).isEqualTo("[2][3][4][5][6][7][8][9][10][11][12][13][14][15]");
        assertThat(BinaryTree.search(root, 1)).isNull();
    }

    @Test
    public void twoChildNodeDeleteTest() {
        // given
        BinaryTree.Node root = BinaryTree.insert(null, 7);
        root = BinaryTree.insert(root, 3);
        root = BinaryTree.insert(root, 11);
        root = BinaryTree.insert(root, 1);
        root = BinaryTree.insert(root, 5);
        root = BinaryTree.insert(root, 9);
        root = BinaryTree.insert(root, 15);
        root = BinaryTree.insert(root, 2);
        root = BinaryTree.insert(root, 4);
        root = BinaryTree.insert(root, 6);
        root = BinaryTree.insert(root, 8);
        root = BinaryTree.insert(root, 10);
        root = BinaryTree.insert(root, 12);
        root = BinaryTree.insert(root, 13);
        root = BinaryTree.insert(root, 14);

        // when
        BinaryTree.delete(root, 11);
        // then
        assertThat(BinaryTree.infixTraversal(root)).isEqualTo("[1][2][3][4][5][6][7][8][9][10][12][13][14][15]");
        assertThat(BinaryTree.search(root, 11)).isNull();
    }

    @Test
    public void twoChildNodeDeleteTest2() {
        // given
        BinaryTree.Node root = BinaryTree.insert(null, 7);
        root = BinaryTree.insert(root, 3);
        root = BinaryTree.insert(root, 11);
        root = BinaryTree.insert(root, 1);
        root = BinaryTree.insert(root, 5);
        root = BinaryTree.insert(root, 9);
        root = BinaryTree.insert(root, 15);
        root = BinaryTree.insert(root, 2);
        root = BinaryTree.insert(root, 4);
        root = BinaryTree.insert(root, 6);
        root = BinaryTree.insert(root, 8);
        root = BinaryTree.insert(root, 10);
        root = BinaryTree.insert(root, 12);
        root = BinaryTree.insert(root, 13);
        root = BinaryTree.insert(root, 14);

        // when
        BinaryTree.delete(root, 9);
        // then
        assertThat(BinaryTree.infixTraversal(root)).isEqualTo("[1][2][3][4][5][6][7][8][10][11][12][13][14][15]");
        assertThat(BinaryTree.search(root, 9)).isNull();
    }

}
