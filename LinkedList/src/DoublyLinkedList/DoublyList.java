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

    void addNodeAfter(Node dll, int prevValue, int newValue){
        Node current = dll;

        if(dll == null){
            System.out.println("Value/Node specified doesn't exist");
            return;
        }

        if(current != null){

            if(current.data == prevValue){
                Node newNode = new Node(newValue);
                Node prev = current.next;

                current.next = newNode;

                newNode.prev = current;
                newNode.next = prev;

                return;
            }
        }
        addNodeAfter(dll.next,prevValue,newValue);
    }

}
