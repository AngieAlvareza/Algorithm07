package ejercicio1;
//@Angie Alvareza Code 
//Stack and Queque Lab 07 
public class StackLink<E> implements Stack<E> {
    private Node<E> top;

    public StackLink() {
        top = null;
    }

    public void push(E x) {
        Node<E> node = new Node<E>(x);
        if (isEmpty()) {
            top = node;
        } else {
            node.setNext(top);
            top = node;
        }
    }

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        E data = top.getData();
        top = top.getNext();
        return data;
    }

    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }
}
