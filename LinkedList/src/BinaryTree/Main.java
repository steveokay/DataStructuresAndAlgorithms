package BinaryTree;

public class Main {
    public static void main(String[] args){

        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right.left = new Node(6);

        // perform
        BinaryTree binary = new BinaryTree();
        binary.inorder(tree);
    }
}
