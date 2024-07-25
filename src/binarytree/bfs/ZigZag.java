package binarytree.bfs;

import java.util.*;

public class ZigZag {
    public static void main(String[] args) {
        TreeNode root = constructTree();
        traverse(root).forEach(System.out::println);
    }

    private static List<Integer> traverse(TreeNode root) {
        List<Integer> output = new ArrayList<>();

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offerFirst(root);
        boolean reverse = false;

        while(!queue.isEmpty()) {
            int treeLength = queue.size();

            for(int i = 0; i < treeLength; i++) {
                if(!reverse) {
                    TreeNode currentNode = queue.pollFirst();
                    output.add(currentNode.val);

                    if(currentNode.left != null) {
                        queue.offerLast(currentNode.left);
                    }

                    if(currentNode.right != null) {
                        queue.offerLast(currentNode.right);
                    }
                } else {
                    TreeNode currentNode = queue.pollLast();
                    output.add(currentNode.val);

                    if(currentNode.right != null) {
                        queue.offerFirst(currentNode.right);
                    }

                    if(currentNode.left != null) {
                        queue.offerFirst(currentNode.left);
                    }
                }
            }

            reverse = !reverse;
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
