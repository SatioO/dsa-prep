package binarytree.bfs;

public class FindLevelOfNode {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        int x = 7;
        int level = findLevel(root, x, 0);
        System.out.println(level);
    }

    private static int findLevel(TreeNode root, int x, int level) {
        if(root == null) {
            return 0;
        }

        if(root.val == x) {
            return level;
        }

        int l = findLevel(root.left, x, level + 1);
        if(l != 0) {
            return l;
        }

        return findLevel(root.right, x, level + 1);
    }
}
