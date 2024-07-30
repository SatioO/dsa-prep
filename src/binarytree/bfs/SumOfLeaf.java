package binarytree.bfs;

public class SumOfLeaf {
    static int sum = 0;
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(findSum(root, false));
    }

    private static int findSum(TreeNode root, boolean isLeft) {
        if(root == null) return 0;

        if(isLeft && (root.left == null && root.right == null)) {
            return root.val;
        }

        return findSum(root.left, true) + findSum(root.right, false);
    }
}
