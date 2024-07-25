package binarytree.bfs;

import java.util.Objects;

public class CheckIfMirror {
    public static void main(String[] args) {
        TreeNode tree1 = TreeNode.constructTree();
        TreeNode tree2 = TreeNode.constructTree();

        System.out.println(traverse(tree1, tree2));
    }

    static boolean traverse(TreeNode r1, TreeNode r2) {
        if(r1 == null && r2 == null) {
            return true;
        }

        if(r1 == null || r2 == null) {
            return false;
        }

        return Objects.equals(r1.val, r2.val) && traverse(r1.left, r2.left) && traverse(r1.right, r2.right);
    }
}
