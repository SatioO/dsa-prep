package btree;

import binarytree.bfs.TreeNode;

import java.util.Arrays;

public class PrintPath {
    public static void main(String[] args) {
        int[] arr = new int[10];
        TreeNode root = TreeNode.constructTree();

        printPath(root, arr, 0);
    }

    private static void printPath(TreeNode root, int[] arr, int i) {
        if(root == null) return;

        arr[i] = root.val;

        if(root.left == null && root.right == null) {
            Arrays.stream(arr).forEach(System.out::print);
            System.out.println(i);
        }

        printPath(root.left, arr, i + 1);
        printPath(root.right, arr, i + 1);
    }
}
