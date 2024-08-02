package btree;

import binarytree.bfs.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrder {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        traverse(root).forEach(System.out::print);
    }

    private static List<Integer> traverse(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while(root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            TreeNode node = stack.pop();
            output.add(node.val);

            root = node.right;
        }

        return output;
    }
}
