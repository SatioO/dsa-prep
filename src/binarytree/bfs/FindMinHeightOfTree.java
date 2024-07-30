package binarytree.bfs;

public class FindMinHeightOfTree {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
//        root.left = new TreeNode(3);
//        root.right = null;
        System.out.println(findHeight(root));
    }

    static int findHeight(TreeNode root) {
        if(root == null) return 0;

        return Math.min(findHeight(root.left), findHeight(root.right)) + 1;
    }
}
