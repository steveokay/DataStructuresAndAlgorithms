package SinglyLinkedList;

public class Main {
    public static void main(String[] args){

        // Init nodes
        Node list1 = new Node(1);
        Node list2 = new Node(2);
        Node list3 = new Node(3);
        Node list4 = new Node(4);
        Node list5 = new Node(5);
        Node list6 = new Node(6);

        // init pointers
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = list5;
        list5.next = list6;

        // check if value exists in linked list
        System.out.println(LinkedList.checkValueExists(list1, 2));
        LinkedList.printList(list1);

        // insert val
        LinkedList.insert(list1,7);
        LinkedList.printList(list1);

        // insert after a given node value
        LinkedList.insertAfter(list1,3,8);
        LinkedList.printList(list1);

        // implement deep copy
        LinkedList.insertAfter(list1,7,9);
        System.out.println( "before >> " + list1);
        Node ret = LinkedList.deepCopy(list1);
        System.out.println( "after >> " + ret);
        LinkedList.printList(ret);

        // delete node
        System.out.println("Deleting node");
        LinkedList.delete(list1,7 );
        LinkedList.printList(ret);

        // count number of nodes
        System.out.println("counting number of nodes");
        System.out.println(LinkedList.countNodes(list1));

        // reverse a linked list
        System.out.println("Reversing a linked list");
        System.out.println("Before reverse");
        LinkedList.printList(list1);
        System.out.println("After reverse");
        LinkedList.reverseList(list1);
        LinkedList.printList(list1);
        System.out.println(LinkedList.countNodes(list1));

    }
}
