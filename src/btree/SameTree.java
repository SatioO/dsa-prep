package btree;

import binarytree.bfs.TreeNode;

import java.util.Objects;

public class SameTree {
    public static void main(String[] args) {
        TreeNode r1 = TreeNode.constructTree();
        TreeNode r2 = TreeNode.constructTree();

        System.out.println(checkSimilarity(r1, r2));;
    }

    private static boolean checkSimilarity(TreeNode r1, TreeNode r2) {
        if(r1 == null && r2 == null) return true;

        if(r1 == null || r2 == null) return false;

        return Objects.equals(r1.val, r2.val) && checkSimilarity(r1.left, r2.left) && checkSimilarity(r1.right, r2.right);
    }
}
