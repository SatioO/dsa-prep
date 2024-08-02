package btree;

import binarytree.bfs.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        traverse(root);
    }

    private static List<Integer> traverse(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new ArrayList<>();
        TreeNode lastVisited = root;
        while(root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            if(node.right == null) {
                output.add(node.val);
                root = node.right;
            } else {
                root = node.right;
            }
        }

        return output;
    }
}
