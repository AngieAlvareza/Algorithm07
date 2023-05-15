package ejercicio2;

import actividad2.Queque;
import ejercicio1.ExceptionIsEmpty;


public class QueueArray<E> implements Queque<E> {
    private int size; // variable para almacenar el tamaño actual de la cola
    private int capacity; // variable para almacenar la capacidad máxima de la cola
    private int first; // variable para almacenar la posición del primer elemento en la cola
    private int last; // variable para almacenar la posición del último elemento en la cola
    private E[] queue; // arreglo que representa la cola

    public QueueArray(int capacity) {
        this.size = 0; // inicialmente la cola está vacía
        this.capacity = capacity; // se asigna la capacidad máxima de la cola
        this.first = 0; // la posición del primer elemento es 0
        this.last = 0; // la posición del último elemento es 0
        this.queue = (E[]) new Object[capacity]; // se crea el arreglo con la capacidad máxima especificada
    }

    public void enqueue(E x) {
        if (size == capacity) {
            throw new IllegalStateException("Queue is full");
        }
        queue[last] = x; // se agrega el elemento al final de la cola
        last = (last + 1) % capacity; // se actualiza la posición del último elemento usando aritmética modular
        size++; // se incrementa el tamaño de la cola
    }

    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        E x = queue[first]; // se obtiene el primer elemento de la cola
        queue[first] = null; // se elimina el primer elemento de la cola
        first = (first + 1) % capacity; // se actualiza la posición del primer elemento usando aritmética modular
        size--; // se decrementa el tamaño de la cola
        return x; // se retorna el elemento eliminado
    }

    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        return queue[first]; // se retorna el primer elemento de la cola
    }

    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        return queue[(last - 1 + capacity) % capacity]; // se retorna el último elemento de la cola usando aritmética modular
    }

    public boolean isEmpty() {
        return size == 0; // la cola está vacía si su tamaño es 0
    }

    public String toString() {
        if (isEmpty()) {
            return "Queue is empty";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(queue[(first + i) % capacity]).append(" ");
        }
        return sb.toString();
    }
}
