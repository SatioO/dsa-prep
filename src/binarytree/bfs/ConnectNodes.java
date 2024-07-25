package binarytree.bfs;

public class ConnectNodes {
    public static void main(String[] args) {
        Node root = constructTree();
        System.out.println(traverse(root).left.right.next.val);
    }

    private static Node traverse(Node root) {
        if(root == null) {
            return null;
        }

        Node leftMost = root;

        while(leftMost.left != null) {
            Node current = leftMost;
            while(current != null) {
                current.left.next = current.right;
                if(current.next != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }

            leftMost = leftMost.left;
        }

        return root;
    }

    private static Node constructTree() {
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);

        return node;
    }
}
