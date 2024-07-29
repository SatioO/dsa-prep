package binarytree.bfs;

public class SumPath {
    static int totalSum = 0;

    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();

        printPathSum(root, 0);
        System.out.println(totalSum);
    }

    static void printPathSum(TreeNode root, int sum) {
        if(root == null) {
            return;
        }

        if(root.left == null && root.right == null) {
            totalSum = totalSum + (sum * 10 + root.val);
        }

        printPathSum(root.left, sum * 10 + root.val);
        printPathSum(root.right, sum * 10 + root.val);
    }
}
