package binarytree.bfs;

import java.util.Objects;

public class CheckIfMirrorStructure {
    public static void main(String[] args) {
        TreeNode r1 = TreeNode.constructTree();
        TreeNode r2 = mirror(TreeNode.constructTree());
        TreeNode.print(r1);
        System.out.println();
        TreeNode.print(r2);
        System.out.println();
        System.out.println(checkIfMirrorStructure(r1, r2));;
    }

    static boolean checkIfMirrorStructure(TreeNode r1, TreeNode r2) {
        if(r1 == null && r2 == null) {
            return true;
        }

        if(r1 == null || r2 == null) {
            return false;
        }

        return Objects.equals(r1.val, r2.val) && checkIfMirrorStructure(r1.left, r2.right) && checkIfMirrorStructure(r1.right, r2.left);
    }

    static TreeNode mirror(TreeNode root) {
        if(root == null) {
            return null;
        }

        TreeNode left = mirror(root.left);
        TreeNode right = mirror(root.right);

        root.left = right;
        root.right = left;
        return root;
    }
}
