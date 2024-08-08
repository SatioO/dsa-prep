package btree;

import binarytree.bfs.TreeNode;

public class CheckIfHeightBalanced {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        root.right.right = null;
        root.right.left = null;
        System.out.println(isHeightBalanced(root));
    }

    static int isHeightBalanced(TreeNode root) {
        if(root == null)  return 0;

        if(root.left == null && root.right == null) return 1;

        int lh = isHeightBalanced(root.left);
        int rh = isHeightBalanced(root.right);

        if(Math.abs(lh - rh) > 1) {
            return -1;
        }

        return Math.max(lh, rh) + 1;
    }
}
