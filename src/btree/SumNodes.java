package btree;

import binarytree.bfs.TreeNode;

public class SumNodes {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(getSum(root));
    }

    static int getSum(TreeNode root) {
        if(root == null) return 0;

        return getSum(root.left) + getSum(root.right) + root.val;
    }
}
