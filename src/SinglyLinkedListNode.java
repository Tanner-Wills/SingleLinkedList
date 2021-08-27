/**
 * Node class used for implementing the SinglyLinkedList.
 */
public class SinglyLinkedListNode<T> {

    private T data;
    private SinglyLinkedListNode<T> next;

    /**
     * Constructs a new SinglyLinkedListNode with the given data and next node
     * reference.
     */
    SinglyLinkedListNode(T data, SinglyLinkedListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Creates a new SinglyLinkedListNode with only the given data.
     */
    SinglyLinkedListNode(T data) {
        this(data, null);
    }

    /**
     * Gets the data.
     */
    T getData() {
        return data;
    }

    /**
     * Gets the next node.
    */
    SinglyLinkedListNode<T> getNext() {
        return next;
    }

    /**
     * Sets the next node.
     */
    void setNext(SinglyLinkedListNode<T> next) {
        this.next = next;
    }
}