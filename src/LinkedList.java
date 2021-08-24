import java.util.Iterator;

public class LinkedList<T> implements Iterable {
    //Instance Variables
    private Node<T> head;
    private Node<T> tail;
    private int size;

    //Constructors
    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    //Getters
    public Node<T> getHead(){
        return this.head;
    }
    public Node<T> getTail(){
        return this.tail;
    }

    public Iterator<T> iterator(){
        return new LLIterator();
    }



    // Remove Duplicates method
    public void removeDuplicates(){
        head = rRemove(head);
    }
    // Recursive solution to removing duplicate nodes.
    private Node<T> rRemove(Node<T> cur){
        if (curr == null) {
            return null;
        }
        curr.next = rRemove(curr.next);
        if (cur.next != null && curr.data.equals(curr.next.data)){
            return curr.next;
        }
        return curr;
    }
    // End method




    private class LLIterator implements Iterator<T>{
        private Node<T> curr;
        LLIterator () { curr = head; }

        @Override
        public boolean hasNext() {
            return curr != null;
        }
        public T next() {}
        if (hasNext()) {
            T temp = curr.data;
            curr = curr.next;
            return temp;
        }
        return null;
    }
}
