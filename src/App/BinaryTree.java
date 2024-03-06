package App;

import org.w3c.dom.Node;


public class BinaryTree {
    public void performTraversal() {
        Node root = createBinaryTree();
        System.out.println("Inorder traversal: ");
        inorderTraversal(root);
        System.out.println("\n");
        System.out.println("Preorder traversal: ");
        preorderTraversal(root);
        System.out.println("\n");
        System.out.println("Postorder traversal: ");
        postorderTraversal(root);
        System.out.println("\n");
    }

    private Node createBinaryTree() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);
        Node node12 = new Node(12);

        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node3.left = node6;
        node3.right = node7;

        node4.left = node8;
        node4.right = node9;

        node5.left = node10;
        node5.right = node11;

        node6.left = node12;

        return node1;
    }

    private void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left());
            System.out.print(node.value() + " ");
            inorderTraversal(node.right());
        }

    }

    private void preorderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.value() + " ");
            preorderTraversal(node.left());
            preorderTraversal(node.right());
        }
    }

    private void postorderTraversal(Node node) {
        if (node != null) {
            postorderTraversal(node.left());
            postorderTraversal(node.right());
            System.out.print(node.value() + " ");
        }
    }

    private class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }

        public Node left() {
            return left;
        }

        public Node right() {
            return right;
        }

    }
}


