package binarytree.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSide {
    public static void main(String[] args) {
        TreeNode root = constructTree();
        traverse(root).forEach(System.out::println);
    }

    private static List<Integer> traverse(TreeNode root) {
        List<Integer> output = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                if(i == levelSize - 1) {
                   output.add(node.val);
                }

                if(node.left != null) {
                    queue.offer(node.left);
                }

                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return output;
    }

    private static TreeNode constructTree() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);
        node.right.right.left = new TreeNode(10);
        node.right.right.right = new TreeNode(11);
        node.right.left.left = new TreeNode(8);
        node.right.left.right = new TreeNode(9);

        return node;
    }
}
