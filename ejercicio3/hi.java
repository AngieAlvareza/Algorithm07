package ejercicio3;

import java.util.ArrayList;
import java.util.LinkedList;

import actividad3.PriorityQueue;
import actividad3.PriorityQueueLinkSort;
import ejercicio1.ExceptionIsEmpty;

public class hi<E, P extends Comparable<P>> implements PriorityQueue<E, P> {

    private ArrayList<PriorityQueue<E, P>> queues;
    private int size;

    public hi(int numPriorities) {
        if (numPriorities <= 0) {
            throw new IllegalArgumentException("La cantidad de prioridades debe ser mayor a cero.");
        }
        queues = new ArrayList<>(numPriorities);
        for (int i = 0; i < numPriorities; i++) {
            queues.add(new PriorityQueueLinkSort<>());
        }
        size = 0;
    }
   
    @Override
    public void enqueue(E x, P pr) {
    	Integer priorityIndex = pr.compareTo(queues.size());

        //int priorityIndex = pr.compareTo(queues.size());
        if (priorityIndex >= 0 && priorityIndex < queues.size()) {
            queues.get(priorityIndex).enqueue(x, pr);
            size++;
        } else {
            throw new IllegalArgumentException("La prioridad debe estar entre 0 y " + (queues.size() - 1) + ".");
        }
    }

    @Override
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        for (int i = queues.size() - 1; i >= 0; i--) {
            PriorityQueue<E, P> pq = queues.get(i);
            if (!pq.isEmpty()) {
                size--;
                return pq.dequeue();
            }
        }
        throw new ExceptionIsEmpty();
    }

    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        for (int i = queues.size() - 1; i >= 0; i--) {
            PriorityQueue<E, P> pq = queues.get(i);
            if (!pq.isEmpty()) {
                return pq.front();
            }
        }
        throw new ExceptionIsEmpty();
    }

    @Override
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        for (int i = 0; i < queues.size(); i++) {
            PriorityQueue<E, P> pq = queues.get(i);
            if (!pq.isEmpty()) {
                return pq.back();
            }
        }
        throw new ExceptionIsEmpty();
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < queues.size(); i++) {
            sb.append("Prioridad ").append(i).append(": ");
            sb.append(queues.get(i).toString()).append("\n");
        }
        return sb.toString();
    }

}
