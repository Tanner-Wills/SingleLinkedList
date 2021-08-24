import java.util.Iterator;

public class LinkedList {

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
