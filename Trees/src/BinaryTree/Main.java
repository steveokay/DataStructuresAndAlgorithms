package BinaryTree;

public class Main {
    public static void main(String[] args){

        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        tree.right.left = new Node(6);
        tree.right.right = new Node(7);

        // perform
        BinaryTree binary = new BinaryTree();

        System.out.println("Inorder traversal");
        binary.inorder(tree);

        System.out.println("\nPre - order traversal");
        binary.preorder(tree);

        System.out.println("\nPost - order traversal");
        binary.postorder(tree);

        System.out.println("\nlevel-order / BFS traversal");
        binary.levelOrder(tree);

        System.out.println("\nInsert new node to tree : ");
        binary.addNodeToTree(tree,8);
        binary.levelOrder(tree);

        System.out.println("\nSum of all keys : " + binary.sumAllKeys(tree));
    }
}
