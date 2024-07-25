package binarytree.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class SwapNodes {
    public static void main(String[] args) {
        TreeNode root = constructTree();
        swap(root);

        System.out.println(root.left.val);
        System.out.println(root.right.val);
        System.out.println(root.left.left.val);
        System.out.println(root.left.right.val);
        System.out.println(root.right.left.val);
        System.out.println(root.right.right.val);
    }

    static TreeNode swap(TreeNode root) {
        if(root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                TreeNode current = queue.poll();
                TreeNode temp = current.left;
                current.left = current.right;
                current.right = temp;

                if(current.left != null) {
                    queue.offer(current.left);
                }

                if(current.right != null) {
                    queue.offer(current.right);
                }
            }
        }

        return root;
    }

    static TreeNode constructTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        return root;
    }
}
