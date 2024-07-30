package binarytree.bfs;

public class RemoveNodesSum {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        solve(root, 10, 0);
        TreeNode.print(root);
    }

    static TreeNode solve(TreeNode root, int k, int sum) {
        if(root == null) return null;

        root.left = solve(root.left, k, sum + root.val);
        root.right = solve(root.right, k, sum + root.val);

        if((root.left == null && root.right == null) && (sum + root.val) < k) {
            return null;
        }

        return root;
    }
}
