package btree;

import binarytree.bfs.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrder {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        Stack<Integer> stack = traverse(root);
        System.out.println(stack);
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }

    static Stack<Integer> traverse(TreeNode root) {
        if(root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        Stack<Integer> output = new Stack<>();
        output.push(root.val);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if(node.right != null) {
                queue.offer(node.right);
                output.push(node.right.val);
            }

            if(node.left != null) {
               queue.offer(node.left);
               output.push(node.left.val);
            }
        }

        return output;
    }
}
