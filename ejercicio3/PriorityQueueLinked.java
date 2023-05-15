package ejercicio3;
//AngieAlvareza code 
//Lab07

import java.util.Queue;

import actividad2.Queque;
import actividad3.PriorityQueue;
import ejercicio1.ExceptionIsEmpty;
import ejercicio2.QueueArray;

public class PriorityQueueLinked<E, P> implements PriorityQueue<E, P> {

    private Queque<E>[] queueArray;

    public PriorityQueueLinked(int numPriorities) {
        queueArray = new Queque[numPriorities];
        for (int i = 0; i < numPriorities; i++) {
        	int size = 0;
			queueArray[i] = new QueueArray<E>(size);

           // queueArray[i] = new QueueArray<E>();
        }
    }

    @Override
    public void enqueue(E element, P priority) {
        int index = getQueueIndex(priority);
        queueArray[index].enqueue(element);
    }

    @Override
    public E dequeue() throws ExceptionIsEmpty {
        for (Queque<E> queue : queueArray) {
            if (!queue.isEmpty()) {
                return queue.dequeue();
            }
        }
        throw new ExceptionIsEmpty();
    }

    @Override
    public E front() throws ExceptionIsEmpty {
        for (Queque<E> queue : queueArray) {
            if (!queue.isEmpty()) {
                return queue.front();
            }
        }
        throw new ExceptionIsEmpty();
    }

    @Override
    public E back() throws ExceptionIsEmpty {
        for (int i = queueArray.length - 1; i >= 0; i--) {
            if (!queueArray[i].isEmpty()) {
                return queueArray[i].back();
            }
        }
        throw new ExceptionIsEmpty();
    }

    @Override
    public boolean isEmpty() {
        for (Queque<E> queue : queueArray) {
            if (!queue.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @SuppressWarnings("unchecked")
	private int getQueueIndex(P priority) {
    	return ((Comparable<P>) priority).compareTo(priority);

        //return ((Comparable<P>) priority).compareTo((P) 0);
    }
}
