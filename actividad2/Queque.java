package actividad2;

import ejercicio1.ExceptionIsEmpty;

public interface Queque<E> { 
	void enqueue(E x);
	E dequeue() throws ExceptionIsEmpty; 
	E front() throws ExceptionIsEmpty; 
	E back() throws ExceptionIsEmpty; 
	boolean isEmpty();
}
