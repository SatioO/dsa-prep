package binarytree.bfs;

public class MinMaxValue {
    static int MIN_VALUE = Integer.MAX_VALUE;
    static int MAX_VALUE = Integer.MIN_VALUE;

    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        findResult(root);
        System.out.println(MIN_VALUE);
        System.out.println(MAX_VALUE);
    }

    private static void findResult(TreeNode root) {
        if(root == null) return;

        if(root.val < MIN_VALUE) {
            MIN_VALUE = root.val;
        }

        if(root.val > MAX_VALUE) {
            MAX_VALUE = root.val;
        }

        findResult(root.left);
        findResult(root.right);
    }
}
