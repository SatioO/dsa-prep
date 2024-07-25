package binarytree.bfs;

public class TreeNode implements Cloneable {
    public TreeNode left;
    public TreeNode right;
    public Integer val;

    public TreeNode(Integer val) {
        this.val = val;
    }

    public static TreeNode constructTree() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(7);

        return node;
    }

    public static void print(TreeNode node) {
        if(node == null) {
            return;
        }

        System.out.print(node.val+"-");
        print(node.left);
        print(node.right);
    }

    @Override
    public TreeNode clone() {
        try {
            TreeNode clone = (TreeNode) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
