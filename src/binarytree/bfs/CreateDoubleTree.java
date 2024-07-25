package binarytree.bfs;

public class CreateDoubleTree {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        TreeNode duplicate = duplicate(root);
        TreeNode.print(duplicate);
    }

    static TreeNode duplicate(TreeNode root) {
        if(root == null) {
            return null;
        }

        duplicate(root.left);
        duplicate(root.right);

        TreeNode newNode = new TreeNode(root.val);
        newNode.left = root.left;
        root.left = newNode;

        return root;
    }
}
