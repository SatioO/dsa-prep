package binarytree.bfs;

public class PrintLeaf {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(traverse(root));

    }

    private static int traverse(TreeNode root) {
        if(root == null) {
            return 0;
        }

        if(root.left == null && root.right == null) {
            return 1;
        }

        return traverse(root.left) + traverse(root.right);
    }
}
