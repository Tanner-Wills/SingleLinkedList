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
     *
     * Method should run in O(n) time.
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
    }

    /**
     * Returns the head node of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the head of the list
     */
    public SinglyLinkedListNode<T> getHead() {
        // DO NOT MODIFY THIS METHOD!
        return head;
    }

    /**
     * Returns the tail node of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the node at the tail of the list
     */
    public SinglyLinkedListNode<T> getTail() {
        // DO NOT MODIFY THIS METHOD!
        return tail;
    }

    /**
     * Returns the size of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}