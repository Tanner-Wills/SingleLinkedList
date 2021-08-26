/*
import java.util.Iterator;

public class LinkedList<T> implements Iterable {
    //Instance Variables
    private Node<T> head;
    private Node<T> tail;
    private int size;

    //Constructors
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    //Getters
    public Node<T> getHead() {
        return this.head;
    }

    public Node<T> getTail() {
        return this.tail;
    }

    public Iterator<T> iterator() {
        return new LLIterator();
    }


    // Remove Duplicates method
    public void removeDuplicates() {
        head = rRemove(head);
    }

    // Recursive solution to removing duplicate nodes.
    private Node<T> rRemove(Node<T> curr) {
        if (curr == null) {
            return null;
        }
        curr.next = rRemove(curr.next);
        if (curr.next != null && curr.data.equals(curr.next.data)) {
            return curr.next;
        }
        return curr;
    }
    // End method
}

 */
