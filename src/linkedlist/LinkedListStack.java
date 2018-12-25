package linkedlist;

import java.util.Iterator;

public class LinkedListStack<E> implements Stack<E> {

    Node stack = null;

    class Node {
        E element;
        Node next;

        Node() {

        }
    }

    @Override
    public void push(E element) {
        // TODO Auto-generated method stub
        Node node = new Node();
        node.element = element;
        node.next = stack;
        stack = node;
    }

    @Override
    public E pop() {
        // TODO Auto-generated method stub
        E element = stack.element;
        stack = stack.next;
        return element;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return stack == null;
    }

    @Override
    public Iterator<E> iterator() {
        // TODO Auto-generated method stub
        return new LinkedListStackIterator();
    }

    class LinkedListStackIterator implements Iterator<E> {

        Node current = stack;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub

            return current != null;
        }

        @Override
        public E next() {
            // TODO Auto-generated method stub
            E element = current.element;
            current = current.next;
            return element;
        }

    }

    public void printList() {
        Node node = stack;
        while (node != null) {
            System.out.print(node.element + "--> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(5);
//		System.out.println(stack.toString());
        stack.printList();
        System.out.println(stack.pop());
    }
}
