package btree;

import binarytree.bfs.TreeNode;

import java.util.*;

public class VerticalTraversal {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        traverse(root).forEach(System.out::println);
    }

    static List<List<Integer>> traverse(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();

        Queue<Map.Entry<TreeNode, Integer>> queue = new LinkedList<>();
        queue.offer(Map.entry(root, 0));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Map<Integer, List<Integer>> map = new HashMap<>();

        while(!queue.isEmpty()) {
            Map.Entry<TreeNode, Integer> node = queue.poll();
            TreeNode key = node.getKey();
            Integer val = node.getValue();

            min = Math.min(min, val);
            max = Math.max(max, val);

            if(map.containsKey(val)) {
                List<Integer> integers = map.get(val);
                integers.add(key.val);
            } else {
                List<Integer> values = new ArrayList<>();
                values.add(key.val);
                map.put(val, values);
            }

            if(key.left != null) {
                queue.offer(Map.entry(key.left, val - 1));
            }

            if(key.right != null) {
                queue.offer(Map.entry(key.right, val + 1));
            }
        }

        for (int i = min; i <= max; i++) {
            List<Integer> values = map.get(i);
            output.add(values);
        }

        return output;
    }
}
