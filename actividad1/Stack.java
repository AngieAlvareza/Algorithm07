package actividad1;

import ejercicio1.ExceptionIsEmpty;

//@AngieAlvareza code
//Lab07 AED05

public interface Stack<E> { 
	void push(E x);
	E pop() throws ExceptionIsEmpty; 
	E top() throws ExceptionIsEmpty; 
	boolean isEmpty();
}

