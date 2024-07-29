package binarytree.bfs;

public class HeightOfTree {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println("is balanced: " + (findHeight(root) > -1));
    }

    private static int findHeight(TreeNode root) {
        if(root == null) { return 0; }

        int lh = findHeight(root.left);
        int rh = findHeight(root.right);

        if(lh == -1 || rh == -1) {
            return -1;
        }

        if(Math.abs(rh - lh) > 1) {
            return -1;
        }

        return Math.max(lh, rh) + 1;
    }
}
