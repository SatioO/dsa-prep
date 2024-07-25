package binarytree.bfs;

import java.util.Stack;

public class InOrder {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        traverse(root);
    }

    private static void traverse(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while(root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            TreeNode node = stack.pop();
            System.out.println(node.val);

            root = node.right;
        }
    }
}
