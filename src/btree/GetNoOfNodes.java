package btree;

import binarytree.bfs.TreeNode;

public class GetNoOfNodes {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(countNodes(root));
    }

    static int countNodes(TreeNode root) {
        if(root == null) return 0;

        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
