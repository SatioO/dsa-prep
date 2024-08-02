package btree;

import binarytree.bfs.TreeNode;

public class SearchElement {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(search(root, 10));
    }

    static int search(TreeNode root, int K) {
        if(root == null) return -1;

        if(root.val == K) {
            return K;
        }

        return Math.max(search(root.left, K), search(root.right, K));
    }
}
