package btree;

import binarytree.bfs.TreeNode;

public class RootToLeafSum {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(findSum(root, 6, 0));
    }

    static boolean findSum(TreeNode root, int K, int sum) {
        if(root == null) return false;
        if(sum + root.val == K) return true;

        return findSum(root.left, K, sum + root.val) || findSum(root.right, K, sum + root.val);
    }
}
