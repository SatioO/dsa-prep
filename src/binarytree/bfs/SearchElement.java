package binarytree.bfs;

public class SearchElement {
    public static void main(String[] args) {
        TreeNode root = TreeNode.constructTree();
        System.out.println(search(root, 2));;
    }

    static boolean search(TreeNode root, int elem) {
        if(root == null) {
            return false;
        }

        if(root.val == elem) {
            return true;
        }

        return search(root.left, elem) || search(root.right, elem);
    }
}
