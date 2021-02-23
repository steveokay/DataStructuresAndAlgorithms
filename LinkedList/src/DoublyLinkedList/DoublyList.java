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
}
