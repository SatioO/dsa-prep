package btree;

import binarytree.bfs.TreeNode;

public class RootToLeafMaxSum {
    static int maxSum = 0;
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(findSum(root, 0));;
    }

    static int findSum(TreeNode root, int sum) {
        if(root == null) return 0;

        if(root.left == null && root.right == null) {
            return sum + root.val;
        }

        return findSum(root.left, sum + root.val) + findSum(root.right, sum + root.val);
    }
}
