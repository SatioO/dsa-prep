package btree;

import binarytree.bfs.TreeNode;

public class HeightOfTree {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(findHeight(root));;
    }

    private static int findHeight(TreeNode root) {
        if(root == null) return -1;

        return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
    }
}
