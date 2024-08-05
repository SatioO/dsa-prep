package btree;

import binarytree.bfs.TreeNode;

public class DuplicateNode {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        TreeNode.print(duplicate(root));
    }

    static TreeNode duplicate(TreeNode root) {
        if(root == null) return null;

        duplicate(root.left);
        duplicate(root.right);

        TreeNode node = new TreeNode(root.val);
        node.left = root.left;
        root.left = node;

        return root;
    }
}
