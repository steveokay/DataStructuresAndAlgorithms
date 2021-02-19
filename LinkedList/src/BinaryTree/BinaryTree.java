package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    // dfs: inorder traversal on binary tree
    public void inorder(Node head) {
        if(head == null)
            return;

        // recur left
        inorder(head.left);

        // print traversed node
        System.out.print(head.data + " ");

        // recur right
        inorder(head.right);
    }

    // dfs: preorder traversal on binary tree
    public void preorder(Node head) {
        if(head == null)
            return;

        //print traversed nodes first
        System.out.print(head.data + " ");

        // recur left
        preorder(head.left);
        // recur right
        preorder(head.right);

    }

    // dfs: postorder traversal on binary tree
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

    // Breadth first / level order traversal on binary tree
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

}
