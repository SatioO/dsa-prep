package binarytree.bfs;

public class MirrorTree {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        mirror(root);

        System.out.println(root.left.left.val);
        System.out.println(root.left.right.val);
    }

    static TreeNode mirror(TreeNode root) {
        if(root == null) {
            return null;
        }

        TreeNode left = mirror(root.left);
        TreeNode right = mirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
