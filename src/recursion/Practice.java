package recursion;

import binarytree.bfs.TreeNode;

public class Practice {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();

        System.out.println(traverse(root, 7));
    }

    private static int traverse(TreeNode root, int x) {
        if(root == null) {
            return 0;
        }

        if(root.val == x) {
            return x;
        }

        traverse(root.left, x);
        return traverse(root.right, x);
    }
}
