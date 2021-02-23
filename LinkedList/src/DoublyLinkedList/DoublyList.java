package DoublyLinkedList;

import java.util.Collections;
import java.util.LinkedList;

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

    void printReverseOrder(Node dll){

        Node current = dll;
        LinkedList<Integer> arrList = new LinkedList<>();

        while(current != null){
            arrList.add(current.data);
            current = current.next;
        }

        Collections.reverse(arrList);
        System.out.print(arrList);
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

    void deleteNode(Node dll, int valueToDelete){
        Node current = dll;
        if(current == null){
            System.out.println("The specified value doesnt exist");
            return;
        }

        if(current.data == valueToDelete){
            current.prev.next = current.next;
            return;
        }

        deleteNode(dll.next, valueToDelete);
    }

}
