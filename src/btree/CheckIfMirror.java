package btree;

import binarytree.bfs.TreeNode;

import java.util.Objects;

public class CheckIfMirror {
    public static void main(String[] args) {
        TreeNode r1 = TreeNode.constructTree();
        TreeNode r2 = mirror(TreeNode.constructTree());

        System.out.println(checkIfMirror(r1, r2));
    }

    static boolean checkIfMirror(TreeNode r1, TreeNode r2) {
        if(r1 == null && r2 == null) return true;

        if(r1 == null || r2 == null) return false;

        return Objects.equals(r1.val, r2.val) && checkIfMirror(r1.left, r2.right) && checkIfMirror(r1.right, r2.left);
    }

    static TreeNode mirror(TreeNode root) {
        if(root == null) return null;

        TreeNode left = mirror(root.left);
        TreeNode right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
