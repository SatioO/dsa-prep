package binarytree.bfs;

public class CountNodes {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(countNodes(root));
    }

    private static int countNodes(TreeNode root) {
        if(root == null) {
            return 0;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}
