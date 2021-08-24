import java.util.Iterator;

public class LinkedList<T> implements Iterable {

    public Iterator<T> iterator(){
        return new LLIterator();
    }


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
