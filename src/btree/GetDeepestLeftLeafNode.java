package btree;

import binarytree.bfs.TreeNode;

public class GetDeepestLeftLeafNode {
    static int minLevel = Integer.MAX_VALUE;

    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
//        root.left.left = null;
//        root.left.right = null;
        findNode(root, 0, false);
        System.out.println(minLevel);
    }

    static void findNode(TreeNode root, int level, boolean isLeft) {
        if(root == null) return;

        if(isLeft && root.left == null && root.right == null && level < minLevel) {
            minLevel = level;
        }

        findNode(root.left, level + 1, true);
        findNode(root.right, level + 1, false);
    }
}
