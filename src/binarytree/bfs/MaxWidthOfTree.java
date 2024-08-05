package binarytree.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfTree {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(findMaxWidth(root));;
    }

    static int findMaxWidth(TreeNode root) {
        if(root == null) return 0;

        int maxWidth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            maxWidth = Math.max(maxWidth, size);

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if(node.left != null) {
                    queue.offer(node.left);
                }

                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return maxWidth;
    }
}
