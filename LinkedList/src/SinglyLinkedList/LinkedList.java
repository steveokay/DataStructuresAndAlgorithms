package SinglyLinkedList;

public class LinkedList {

    // print the linked list
    static void printList(Node head){
        Node current = head;

        while(current != null){
            System.out.print(current.data + " => ");
            current = current.next;
        }
        System.out.print("NULL\n");
    }

    // check if value exists in the given list
    static boolean checkValueExists(Node head, int val){

        // init current pointer
        Node current = head;

        // if head is null return false
        if(head == null){
            return false;
        }

        while(current != null){
            if(current.data == val){
                return true;
            }
            // move pointer to next array location
            current = current.next;
        }

        return false;
    }

    // function to insert the value at the end of the linked list
    static void insert(Node head, int value){

        Node current = head;

        // init the node to insert
        Node newNode = new Node(value);

        if(current.next != null)
            insert(current.next,value);
        else
            current.next = newNode;
    }

    // insert value after a given linked list value
    // assumption is that you want to insert after the 1st occurrence
    // in case a number occurs more than once we will just insert after the 1st occurrence
    static Node insertAfter(Node head, int previous, int value){

        Node newNode = new Node(value);
        Node current = head;

        if(current == null){
            System.out.println("Previous entered doesn't exist in the linked list");
            return null;
        }

        if( current.data != previous){
            insertAfter(current.next, previous, value);
        }else {
            newNode.next = current.next;
            current.next = newNode;
        }

        return head;
    }

    // function to implement deep copy of the linked list
    static Node deepCopy(Node head){

        // if null then return null
        if(head == null){
            return null;
        }

        Node nextNode = head.next;
        Node current = head;

        // new deep copy node
        Node newNode = new Node(current.data);

        if(current != null){
            newNode.next = nextNode;
            deepCopy(current.next);

        }else{
            return null;
        }

        return newNode;
    }

    // removes value from linked list
    // removes the first occurrence of value provided
    static void delete(Node head, int val){

        if(head == null)
            return;

        Node current = head;
        Node previous = null;

        // we use iterative instead of recursive
        while(current != null){
            // check if data is the one to delete
            if(current.data == val){
                // delete
                // take cur.previous node and point it to cur.next
                previous.next = current.next;
                return;
            }

            previous = current;
            current = current.next;
        }

    }

    // function used to reverse a linked list
    static void reverseList(Node head){
        // TODO: Not working well must check on this later
        Node current = head;
        Node prev = null;
        Node next = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    }

    // returns number of nodes in a linkedList
    static int countNodes(Node head){
        int counter = 0;
        Node current = head;

        // iterative
        while(current != null){
            counter++;
            current = current.next;
        }

        return counter;
    }

}
