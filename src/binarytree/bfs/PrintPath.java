package binarytree.bfs;

import java.util.Arrays;

public class PrintPath {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        int[] arr = new int[3];
        print(root, arr, 0);
    }

    private static void print(TreeNode root, int[] arr, int index) {
        if(root == null) return;

        arr[index] = root.val;

        if(root.left == null && root.right == null) {
            Arrays.stream(arr).forEach(System.out::print);
            System.out.println();
        }

        print(root.left, arr, index + 1);
        print(root.right, arr, index + 1);
    }
}
