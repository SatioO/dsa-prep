package btree;

import binarytree.bfs.TreeNode;

import java.util.*;

public class PreOrder {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        TreeNode.print(root);
        System.out.println();
        traverse(root).forEach(System.out::print);
        System.out.println();
    }

    static List<Integer> traverse(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                output.add(root.val);
                root = root.left;
            }

            TreeNode node = stack.pop();
            root = node.right;
        }

        return output;
    }
}
