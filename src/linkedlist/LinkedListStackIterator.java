package linkedlist;

import java.util.Iterator;

import linkedlist.LinkedListStack.Node;

public class LinkedListStackIterator<E> implements Iterator<E> {
    private Node stack;
    Node current = stack;

    public boolean hasNext() {
        return current != null;
    }

    public E next() {
        E element = (E) current.element;
        current = current.next;
        return element;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
