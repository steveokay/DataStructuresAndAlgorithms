package DoublyLinkedList;

public class Main {

    public static void main(String[] args){

        // init nodes
        Node dll1 = new Node(1);
        Node dll2 = new Node(2);
        Node dll3 = new Node(3);
        Node dll4 = new Node(4);
        Node dll5 = new Node(5);
        Node dll6 = new Node(6);

        // next nodes
        dll1.next = dll2;
        dll2.next = dll3;
        dll3.next = dll4;
        dll4.next = dll5;
        dll5.next = dll6;

        // prev nodes
        dll2.prev = dll1;
        dll3.prev = dll2;
        dll4.prev = dll3;
        dll5.prev = dll4;
        dll6.prev = dll5;

        DoublyList doubly = new DoublyList();

        System.out.println("Print all next nodes");
        doubly.printAllNextNodes(dll1);

        System.out.println("\nAdd node after last index");
        doubly.addNodeToDll(dll1, 7);
        doubly.printAllNextNodes(dll1);

        System.out.println("\nAdd node new after given value/node");
        doubly.addNodeAfter(dll1, 1, 10);
        doubly.printAllNextNodes(dll1);

        System.out.println("\nDelete given value from DLL");
        doubly.deleteNode(dll1,10);
        doubly.printAllNextNodes(dll1);

        System.out.println("\nReverse traversal of the DLL");
        doubly.printReverseOrder(dll1);

        System.out.println("\nDeepCopy Doubly Linked List");
        Node deepCopied = doubly.deepCopyDll(dll1);
        doubly.printAllNextNodes(deepCopied);

        System.out.println();
        System.out.print(dll1);
        System.out.println();
        System.out.print(deepCopied);
    }
}
