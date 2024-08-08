package btree;

import binarytree.bfs.TreeNode;

public class TreeFromInorder {
    static int preIndex = 0;

    public static void main(String[] args) {
        int[] preorder = {2,4,7,3,8};
        int[] inorder = {7,4,3,2,8};

        buildTree(preorder, inorder, 0, inorder.length - 1);
    }

    static TreeNode buildTree(int[] preorder, int[] inorder, int start, int end) {
        if(start > end) {
            return null;
        }

        TreeNode node = new TreeNode(preorder[preIndex++]);

        if(start == end) {
            return node;
        }

//        node.left = buildTree(preorder, inorder, start, inIndex - 1);
//        node.right = buildTree(preorder, inorder, inIndex + 1, end);

        return node;
    }
}
