package binarysearchtree;

import binarytree.bfs.TreeNode;

public class ConstructBST {
    public static void main(String[] args) {
        int[] arr = {5,8,2,9,3,1};
        construct(arr);
    }

    static void construct(int[] arr) {
        if(arr.length == 0) {
            return;
        }

        TreeNode root = new TreeNode(arr[0]);
        int i = 1;

        while(i < arr.length) {
            traverse(root, arr[i]);
            i++;
        }
    }

    private static void traverse(TreeNode root, int value) {
        if(value > root.val) {
            if(root.right == null) {
                root.right = new TreeNode(value);
            } else {
                traverse(root.right, value);
            }
        } else {
            if(root.left == null) {
                root.left = new TreeNode(value);
            } else {
                traverse(root.left, value);
            }
        }
    }
}
