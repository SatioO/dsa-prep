package btree;

import binarytree.bfs.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FindMinHeight {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        root.right.right = null;
        root.right.left = null;
        System.out.println(findHeight(root));
    }

    static int findHeight(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int height = Integer.MAX_VALUE;
        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if(node.left == null && node.right == null) {
                    height = Math.min(height, level);
                }

                if(node.left != null) {
                    queue.offer(node.left);
                }

                if(node.right != null) {
                    queue.offer(node.right);
                }
            }

            level ++;
        }

        return height;
    }
}
