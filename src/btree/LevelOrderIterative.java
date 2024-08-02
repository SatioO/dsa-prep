package btree;

import binarytree.bfs.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderIterative {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        traverse(root).forEach(System.out::print);
    }

    private static List<Integer> traverse(TreeNode root) {
        List<Integer> output = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            output.add(node.val);

            if(node.left != null) {
                queue.offer(node.left);
            }

            if(node.right != null) {
                queue.offer(node.right);
            }
        }

        return output;
    }
}
