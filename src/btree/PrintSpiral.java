package btree;

import binarytree.bfs.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class PrintSpiral {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        print(root);
    }

    static void print(TreeNode root) {
        if(root == null) return;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offerFirst(root);
        boolean reverse = false;

        while(!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                if(!reverse) {
                    TreeNode node = queue.pollFirst();
                    System.out.println(node.val);

                    if(node.left != null) {
                        queue.offerLast(node.left);
                    }

                    if(node.right != null) {
                        queue.offerLast(node.right);
                    }
                } else {
                    TreeNode node = queue.pollLast();
                    System.out.println(node.val);

                    if(node.right != null) {
                        queue.offerFirst(node.right);
                    }

                    if(node.left != null) {
                        queue.offerFirst(node.left);
                    }
                }
            }

            reverse = !reverse;
        }
    }
}