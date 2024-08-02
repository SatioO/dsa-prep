package btree;

import binarytree.bfs.TreeNode;

public class LevelOrderRecursion {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        printNodes(root);
    }

    static int findHeight(TreeNode root) {
        if(root == null) return -1;

        return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
    }

    private static void printNodes(TreeNode root) {
        int height = findHeight(root);

        for(int i = 0; i <= height; i++) {
            traverse(root, i + 1);
        }
    }

    static void traverse(TreeNode root, int level) {
        if(root == null) return;

        if(level == 1) {
            System.out.println(root.val);
            return;
        }

        traverse(root.left, level - 1);
        traverse(root.right, level - 1);
    }
}
