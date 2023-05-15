package actividad2;
//AngieAlvareza code
//ejercercicio2 Lab07 Stack and Queue

import ejercicio1.ExceptionIsEmpty;

public class QueueLink<E> implements Queque<E> {
    
    private Node<E> head; // Apunta al primer nodo de la cola
    private Node<E> tail; // Apunta al último nodo de la cola
    private int size;     // Almacena el número de elementos en la cola
    
//    private static class Node<E> {
//        E element;
//        Node<E> next;
//        
//        public Node(E element, Node<E> next) {
//            this.element = element;
//            this.next = next;
//        }
//    }
//    
//    public QueueLink() {
//        head = null;
//        tail = null;
//        size = 0;
//    }

    public void enqueue(E x) {
        Node<E> newNode = new Node<>(x, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        E removedElement = head.data;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return removedElement;
    }

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
	        return tail.data;
	    }

	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	public String toString() {
	    if (isEmpty()) {
	        return "La cola está vacía";
	    }
	    StringBuilder sb = new StringBuilder();
	    Node<E> current = head;
	    while (current != null) {
	        sb.append(current.data.toString()).append(" ");
	        current = current.next;
	    }
	    return sb.toString();
	}

}
