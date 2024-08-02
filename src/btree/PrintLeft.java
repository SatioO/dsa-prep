package btree;

import binarytree.bfs.TreeNode;

public class PrintLeft {
    static int maxLevel = 0;
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        print(root, 0);
    }

    static void print(TreeNode root, int level) {
        if(root == null) return;

        if(level == maxLevel) {
            System.out.println(root.val);
            maxLevel += 1;
        }

        print(root.left, level + 1);
        print(root.right, level + 1);
    }
}
