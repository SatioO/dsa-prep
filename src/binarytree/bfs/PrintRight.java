package binarytree.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintRight {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();

        traverse(root).forEach(System.out::println);
    }

    private static List<Integer> traverse(TreeNode root) {
        Queue<TreeNode>  queue = new LinkedList<>();
        queue.add(root);
        List<Integer> output = new ArrayList<>();

        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                if(i == len -1) {
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
    };

}
