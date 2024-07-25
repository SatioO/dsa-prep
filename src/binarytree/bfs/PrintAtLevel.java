package binarytree.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class PrintAtLevel {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();

        printNodes(root, 3);
    }

    private static void printNodes(TreeNode root, int level) {
        if(root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int cl = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();

            for(int i = 0; i < len; i++) {
                TreeNode node = queue.poll();

                if(cl == level) {
                    System.out.println(node.val);
                }

                if(node.left != null) {
                    queue.offer(node.left);
                }

                if(node.right != null) {
                    queue.offer(node.right);
                }

            }

            cl++;
        }

    }

}
