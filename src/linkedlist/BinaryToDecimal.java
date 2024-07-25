package linkedlist;

import binarytree.bfs.TreeNode;

public class BinaryToDecimal {
    public static void main(String[] args) {
        TreeNode ll = constructLL();
        System.out.println(convertToDecimal(ll, 0));
    }

    static int convertToDecimal(TreeNode ll, int output) {
//        if(ll == null) {
//            return output;
//        }
//
//        return convertToDecimal(ll.right, (output << 1) + ll.val);

        while(ll != null) {
            output = (output << 1) + ll.val;
            ll = ll.right;
        }

        return output;
    }

    static TreeNode constructLL() {
        TreeNode head = new TreeNode(0);
        head.right = new TreeNode(0);
        head.right.right = new TreeNode(1);
        head.right.right.right = new TreeNode(1);

        return head;
    }
}
