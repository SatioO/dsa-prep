package btree;

import binarytree.bfs.TreeNode;

public class SumOfLeafNodes {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(findSum(root));
    }

    static int findSum(TreeNode root) {
        if(root == null) return 0;

        if(root.left == null && root.right == null) {
            return root.val;
        }

        return findSum(root.left) + findSum(root.right);
    }
}
