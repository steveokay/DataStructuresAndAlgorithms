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

    public void addNodeToTree(Node root, int newKey){
        if(root == null){
            root = new Node(newKey);
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        // level order traversal looking fo empty space
        while(!queue.isEmpty()){
            root = queue.peek();
            queue.remove();

            if(root.left == null){
                root.left = new Node(newKey);
                break;
            }else{
                queue.add(root.left);
            }

            if(root.right == null){
                root.right = new Node(newKey);
                break;
            }else{
                queue.add(root.right);
            }
        }
    }

    public int sumAllKeys(Node tree){
        if(tree == null)
            return 0;
        return (tree.data + sumAllKeys(tree.left) + sumAllKeys(tree.right));
    }

}
