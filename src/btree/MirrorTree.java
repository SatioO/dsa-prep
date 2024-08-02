package btree;

import binarytree.bfs.TreeNode;

public class MirrorTree {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        TreeNode mirrored = mirror(root);
    }

    private static TreeNode mirror(TreeNode root) {
        if(root ==  null) return null;

        TreeNode left = mirror(root.left);
        TreeNode right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
