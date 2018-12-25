package linkedlist;

public interface Stack<E> extends Iterable<E> {

    public void push(E element);

    public E pop();

    public boolean isEmpty();
}
