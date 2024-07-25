package binarytree.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidth {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(findMaxWidth(root));
    }

    static int findMaxWidth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int maxWidth = 0;

        while (!queue.isEmpty()) {
            int queueWidth = queue.size();

            for (int i = 0; i < queueWidth; i++) {
                TreeNode node = queue.poll();

                if(node.left != null) {
                    queue.offer(node.left);
                }

                if(node.right != null) {
                    queue.offer(node.right);
                }
            }

            maxWidth = Math.max(maxWidth, queueWidth);
        }

        return maxWidth;
    }
}
