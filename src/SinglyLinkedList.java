import java.util.NoSuchElementException;

/**
 * Implementation of a Singly-Linked List.
 */
public class SinglyLinkedList<T> {

    private SinglyLinkedListNode<T> head;
    private SinglyLinkedListNode<T> tail;
    private int size;

    //No constructor needed

    /*** Singly Linked List Methods ***
     *
     * Adds the element to the front of the list.
     */
    public void addToFront(T data) {
        if(data == null){
            throw new IllegalArgumentException("Can't add null data to the list!");
        }
        //Declare new node
        SinglyLinkedListNode<T> nodeAddFront;

        //If list is size 0
        if(size == 0){
            nodeAddFront = new SinglyLinkedListNode(data, null);
            head = nodeAddFront;
            tail = nodeAddFront;
        } else {
            nodeAddFront = new SinglyLinkedListNode(data, head);
            head = nodeAddFront;
        }
        size += 1;
    }

    /**
     * Adds the element to the back of the list.
     */
    public void addToBack(T data) {
        if(data == null){
            throw new IllegalArgumentException("Can't add null data to the list!");
        }
        //Declare new node
        SinglyLinkedListNode<T> nodeAddBack = new SinglyLinkedListNode(data, null);

        //If list is size 0
        if(size == 0){
            head = nodeAddBack;
            tail = nodeAddBack;
        } else {
            tail.setNext(nodeAddBack);
        }
        size += 1;
    }

    /**
     * Removes and returns the first data of the list.
     */
    public T removeFromFront() {
        if(size == 0){
            throw new IllegalArgumentException("Can't remove a node from an empty list!");
        }
        //Store removed node
        SinglyLinkedListNode<T> nodeRemoveFront = new SinglyLinkedListNode(head.getData(), null);

        //If list is size 1
        if(size == 1){
            head = null;
            tail = null;
        } else {
            head = head.getNext();
        }
        size -= 1;
        return (T) nodeRemoveFront;
    }

    /**
     * Removes and returns the last data of the list.
     * Method should run in O(n) time.
     */
    public T removeFromBack() {
        if(size == 0){
            throw new IllegalArgumentException("Can't remove a node from an empty list!");
        }
        //Store removed node
        SinglyLinkedListNode<T> nodeRemoveBack = head;
        SinglyLinkedListNode<T> nodeOldTail = tail;

        //If list is size 1
        if(size == 1){
            head = null;
            tail = null;
        } else {
            while(nodeRemoveBack.getNext().getNext() != null){
                nodeRemoveBack = nodeRemoveBack.getNext();
            }
            nodeRemoveBack.setNext(null);
            tail = nodeRemoveBack;
        }
        size -= 1;
        return (T) nodeOldTail;
    }

    /**
     * Returns the head node of the list.
     */
    public SinglyLinkedListNode<T> getHead() {
        return head;
    }

    /**
     * Returns the tail node of the list.
     */
    public SinglyLinkedListNode<T> getTail() {
        return tail;
    }

    /**
     * Returns the size of the list.
     */
    public int size() {
        return size;
    }
}