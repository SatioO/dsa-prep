package binarytree.bfs;

public class FlattenBT {
    public static void main(String[] args) {
        TreeNode root = constructTree();

        constructLL(root);

        while(root != null) {
            System.out.println(root.val);
            root = root.right;
        }
    }

    static void constructLL(TreeNode root) {
        while (root != null) {
            TreeNode left = root.left;
            if(left != null) {
                while (left.right != null) {
                    left = left.right;
                }

                left.right = root.right;
                root.right = root.left;
                root.left = null;
            }

            root = root.right;
        }
    }

    static TreeNode constructTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        return root;
    }
}
