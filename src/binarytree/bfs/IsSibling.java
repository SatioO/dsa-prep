package binarytree.bfs;

public class IsSibling {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(isCousins(root, 2, 3));
    }

    private static boolean isCousins(TreeNode root, int x, int y) {
        int l1 = findLevel(root, x, 0);
        int l2 = findLevel(root, y, 0);

        return (l1 == l2) && !isSibling(root, x, y);
    }

    private static boolean isSibling(TreeNode root, int x, int y) {
        if(root == null) {
            return false;
        }

        if((root.left != null && root.left.val == x) && (root.right != null && root.right.val == y)) {
            return true;
        } else if((root.left != null && root.left.val == y) && (root.right != null && root.right.val == x)) {
            return true;
        } else {
            return isSibling(root.left, x, y) || isSibling(root.right, x, y);
        }
    }


    private static int findLevel(TreeNode root, int x, int level) {
        if(root == null) {
            return 0;
        }

        if(root.val == x) {
            return level;
        }

        int l = findLevel(root.left, x, level + 1);
        if(l > 0) {
            return l;
        }

        return findLevel(root.right, x, level + 1);
    }
}
