package ru.job4j.tree;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryTreeLCATest {

    @Test
    public void testFindLCACommonAncestor() {
        // Создание дерева
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        BinaryTreeLCA lcaFinder = new BinaryTreeLCA();

        // Тест 1: общий предок для 5 и 1 должен быть 3
        TreeNode result = lcaFinder.findLCA(root, root.left, root.right);
        assertEquals(result.val, (3));

        // Тест 2: общий предок для 5 и 4 должен быть 5
        result = lcaFinder.findLCA(root, root.left, root.left.right.right);
        assertEquals(result.val, (5));

        // Тест 3: общий предок для 7 и 4 должен быть 2
        result = lcaFinder.findLCA(root, root.left.right.left, root.left.right.right);
        assertEquals(result.val, (2));
    }

    @Test
    public void testFindLCASameNode() {
        // Создание дерева
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        BinaryTreeLCA lcaFinder = new BinaryTreeLCA();

        // Тест 4: когда оба узла одинаковы, LCA должен быть сам узел
        TreeNode result = lcaFinder.findLCA(root, root.left, root.left);
        assertEquals(result.val, (5));
    }
}
