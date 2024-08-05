package btree;

import binarytree.bfs.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class GetWidthOfLevel {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(getWidthD(root, 2, 0));
    }

    static int getWidthD(TreeNode root, int K, int level) {
        if(root == null) return 0;

        if(level == K) {
            return 1;
        }

        return getWidthD(root.left, K, level + 1) + getWidthD(root.right, K, level + 1);
    }

    static int getWidth(TreeNode root, int K) {
        if(root == null) return 0;
        if(K < 0) return 0;

        int width = 0;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while(!queue.isEmpty()) {
            int size = queue.size();
            if(level == K) {
                width = size;
                break;
            }

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    queue.offer(node.left);
                }

                if(node.right != null) {
                    queue.offer(node.right);
                }
            }

            level +=1;
        }

        return width;
    }
}
