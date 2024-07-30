package binarytree.bfs;

public class RemoveNodesK {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        root.right.right = null;
        root.right.left = null;

        remove(root, 2, 0);
        TreeNode.print(root);
    }

    static TreeNode remove(TreeNode root, int k, int level) {
        if(root == null) return null;

        root.left = remove(root.left, k, level + 1);
        root.right = remove(root.right, k, level + 1);

        if((root.left == null && root.right == null) & level < k) {
            return null;
        }

        return root;
    }
}
