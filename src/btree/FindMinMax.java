package btree;

import binarytree.bfs.TreeNode;

public class FindMinMax {
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        find(root);
        System.out.println("min: " + min + " max: " + max);
    }

    static void find(TreeNode root) {
        if(root == null) return;

        if(root.val < min) {
            min = root.val;
        }

        if(root.val > max) {
            max = root.val;
        }

        find(root.left);
        find(root.right);
    }
}
