package binarytree.bfs;

import com.sun.source.tree.Tree;

public class FindLevel {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(findLevel(root, 1));
    }


    private static int findLevel(TreeNode root, int level) {
        if(root == null) {
            return 0;
        }

        return Math.max(findLevel(root.left, level + 1), findLevel(root.right, level + 1)) + 1;
    }
}
