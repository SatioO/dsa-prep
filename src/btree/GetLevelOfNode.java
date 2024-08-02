package btree;

import binarytree.bfs.TreeNode;

public class GetLevelOfNode {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(findLevel(root, 3, 0));;
    }

    static int findLevel(TreeNode root, int K, int level) {
        if(root == null) return -1;

        if(root.val == K) return level;

        int il = findLevel(root.left, K, level + 1);
        int rl = findLevel(root.right, K, level + 1);

        return Math.max(il, rl);
    }
}
