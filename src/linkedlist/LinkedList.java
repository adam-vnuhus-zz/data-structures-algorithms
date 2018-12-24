package linkedlist;

public class LinkedList {

    Node head; // head of list

    /* Linked list Node*/
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized 
        // as null 
        Node() {

        }

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    /* This function prints contents of linked list starting from head */
    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + "--> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Start with the empty list. */
        LinkedList linkedlist = new LinkedList();

        linkedlist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedlist.head.next = second; // Link first node with the second node
        second.next = third; // Link first node with the second node 

        linkedlist.printList();
    }

}
