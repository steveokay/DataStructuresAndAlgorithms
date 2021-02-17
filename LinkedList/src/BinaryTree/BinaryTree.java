package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    ////////////////  DEPTH FIRST SEARCH BINARY TREE FUNCTIONS ///////////////

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
        if(head == null)
            return;

        //print first
        System.out.print(head.data + " ");

        // recur left
        preorder(head.left);
        // recur right
        preorder(head.right);

    }

    // dfs : f(X) to do a postorder traversal on the tree
    public void postorder(Node head) {
        if(head == null)
            return;

        // recur left
        postorder(head.left);

        // recur right
        postorder(head.right);

        // print nodes traversed
        System.out.print(head.data + " ");

    }

    ///////////////   END OF DEPTH FIRST SEARCH BINARY TREE FUNCTIONS /////////////

    /////// Breadth first / level order traversal /////////
    public void levelOrder(Node head){
        // using queue method
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(head);

        // while queue is not empty
        while(!queue.isEmpty()){
            // remove current head
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            // enqueue left child
            if(tempNode.left != null){
                queue.add(tempNode.left);
            }

            // enqueue right child
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
        }
    }

    /////////////// end of level order traversal//////////

}
