package binarytree.bfs;

public class MaxSum {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(maxSum(root, 0));
    }

    private static int maxSum(TreeNode root, int sum) {
        if(root == null) {
            return sum;
        }

        return Math.max(maxSum(root.left, sum + root.val), maxSum(root.right, sum + root.val));
    }
}
