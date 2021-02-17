package BinaryTree;

public class BinaryTree {

    // dfs : f(x) to perform inorder traversal
    public void inorder(Node head) {
        if(head == null)
            return;

        // recur left
        inorder(head.left);

        // print node
        System.out.print(head.data + " ");

        // recur right
        inorder(head.right);
    }

    // dfs function to do a preorder traversal on the tree
    public void preorder(Node head) {
    }

    // dfs : f(X) to do a postorder traversal on the tree
    public void postorder(Node head) {

    }

    // function  to print node values
    public void printNodes(Node head) {

    }

    // function to count all nodes in the binary tree
    public void countNodes(Node head) {

    }

}
