package binarytree.bfs;

import java.util.Stack;

public class PostOrder {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        traverse(root);
    }

    private static void traverse(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode lastVisited = root;

        while(root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            TreeNode temp = stack.peek().right;
            if(temp == null || lastVisited == temp) {
                TreeNode node = stack.pop();
                System.out.println(node.val);
                lastVisited = node;
            } else {
                root = temp;
            }
        }
    }
}
