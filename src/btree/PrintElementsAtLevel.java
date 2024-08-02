package btree;

import binarytree.bfs.TreeNode;

public class PrintElementsAtLevel {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        printNodes(root, 2, 1);
    }

    private static void printNodes(TreeNode root, int K, int level) {
        if(root == null) return;

        if(level == K) {
            System.out.println(root.val);
        }

        printNodes(root.left, K, level + 1);
        printNodes(root.right, K, level + 1);
    }
}
