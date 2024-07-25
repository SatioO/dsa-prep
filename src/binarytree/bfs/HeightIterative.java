package binarytree.bfs;

import java.util.Stack;

public class HeightIterative {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(traverse(root));
    }

    private static int traverse(TreeNode root) {
        if(root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        int maxHeight = -1;
        while(root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            maxHeight = Math.max(maxHeight, stack.size() - 1);
            TreeNode node = stack.pop();
            root = node.right;
        }

        return maxHeight;
    }
}
