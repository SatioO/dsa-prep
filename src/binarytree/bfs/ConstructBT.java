package binarytree.bfs;

import java.util.Arrays;

public class ConstructBT {
    public static void main(String[] args) {
        int[] preorder = {3,9,20, 15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode.print(constructTree(preorder, inorder));
    }

    private static TreeNode constructTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        int mid = findMid(inorder, preorder[0]);

        root.left = constructTree(Arrays.copyOfRange(preorder, 1, mid + 1), Arrays.copyOfRange(inorder, 0, mid));
        root.right = constructTree(Arrays.copyOfRange(preorder, mid + 1, preorder.length - 1), Arrays.copyOfRange(inorder, mid + 1, inorder.length - 1));

        return root;
    }

    static int findMid(int[] inorder, int val) {
        for(int i = 0; i < inorder.length; i++) {
            if(inorder[i] == val) {
                return i;
            }
        }

        return -1;
    }
}
