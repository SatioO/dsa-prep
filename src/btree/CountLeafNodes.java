package btree;

import binarytree.bfs.TreeNode;

public class CountLeafNodes {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(countLeaf(root));
    }

    private static int countLeaf(TreeNode root) {
        if(root == null) return 0;

        if(root.left == null && root.right == null) return 1;

        return countLeaf(root.left) + countLeaf(root.right);
    }
}
