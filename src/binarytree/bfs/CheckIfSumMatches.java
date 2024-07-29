package binarytree.bfs;

public class CheckIfSumMatches {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(checkSum(root, 8));
    }

    private static boolean checkSum(TreeNode root, int target) {
        if(root == null) return false;

        if(root.left == null && root.right == null && root.val == target) {
            return true;
        }

        return checkSum(root.left, target - root.val) || checkSum(root.right, target - root.val);
    }
}
