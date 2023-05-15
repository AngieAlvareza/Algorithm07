package actividad3;


import ejercicio1.ExceptionIsEmpty;

public class PriorityQueueLinkSort<E, P extends Comparable<P>> implements PriorityQueue<E, P> {
    
    private EntryNode<E, P> head;
    private int size;
    
    public PriorityQueueLinkSort() {
        head = null;
        size = 0;
    }

    @Override
    public void enqueue(E x, P pr) {
        EntryNode<E, P> nuevo = new EntryNode<>(x, pr);
        if (head == null) {
            head = nuevo;
        } else if (pr.compareTo(head.priority) < 0) {
            nuevo.next = head;
            head = nuevo;
        } else {
            EntryNode<E, P> actual = head;
            while (actual.next != null && pr.compareTo(actual.next.priority) >= 0) {
                actual = actual.next;
            }
            nuevo.next = actual.next;
            actual.next = nuevo;
        }
        size++;
    }

    @Override
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        E elemento = head.data;
        head = head.next;
        size--;
        return elemento;
    }

    @Override
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        return head.data;
    }

    @Override
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        EntryNode<E, P> actual = head;
        while (actual.next != null) {
            actual = actual.next;
        }
        return actual.data;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        EntryNode<E, P> actual = head;
        while (actual != null) {
            sb.append("(").append(actual.data.toString()).append(", ").append(actual.priority.toString()).append(") ");
            actual = actual.next;
        }
        return sb.toString();
    }
    
    private static class EntryNode<E, P> {
        E data;
        P priority;
        EntryNode<E, P> next;
        
        public EntryNode(E data, P priority) {
            this.data = data;
            this.priority = priority;
            next = null;
        }
    }
}
