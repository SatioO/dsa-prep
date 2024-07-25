package binarytree.bfs;

public class CheckIfFoldable {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(checkFoldable(root, root));
    }

    static boolean checkFoldable(TreeNode r1, TreeNode r2) {
        if(r1 == null && r2 == null) {
            return true;
        }

        if(r1 == null || r2 == null) {
            return false;
        }

        return checkFoldable(r1.left, r2.right) && checkFoldable(r1.right, r2.left);
    }
}
