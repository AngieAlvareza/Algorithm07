package ejercicio1;

public class StackArray<E> implements Stack<E> {
    private static final int MAX_SIZE = 10;
    private E[] elements;
    private int topIndex;

    public StackArray() {
        elements = (E[]) new Object[MAX_SIZE];
        topIndex = -1;
    }

    public void push(E x) {
        if (topIndex >= MAX_SIZE - 1) {
            System.out.println("Error: la pila está llena.");
            return;
        }
        elements[++topIndex] = x;
    }

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        return elements[topIndex--];
    }

    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        return elements[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }
}