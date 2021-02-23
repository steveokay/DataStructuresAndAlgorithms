package DoublyLinkedList;

public class DoublyList {

    void printAllNextNodes(Node dll){

        Node current = dll;

        if(current == null){
            System.out.print("NULL");
            return;
        }

        System.out.print(current.data + " => ");

        printAllNextNodes(current.next);
    }

    // add after last index
    void addNodeToDll(Node dll, int value){
        Node current = dll;

        if(current.next == null){
            Node newNode = new Node(value);
            current.next = newNode;
            current.prev = current;
            return;
        }

        addNodeToDll(dll.next,value);
    }

}
