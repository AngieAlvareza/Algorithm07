package ejercicio1;
//@AngieAlvareza code
//Stakc and Queque Code  LAb07

public class TestStackLink {
	
    public static void main(String[] args) throws ExceptionIsEmpty {
    	Stack<String> stack1 = new StackLink<String>(); // Creamos una pila de Strings con implementación de lista enlazada
    	Stack<Integer> stack2 = new StackLink<Integer>(); // Creamos una pila de enteros con implementación de lista enlazada
    	// Agregamos elementos a la pila de Strings
    	stack1.push("Hola");
    	stack1.push("Mundo");
    	stack1.push("!");

    	// Agregamos elementos a la pila de enteros
    	stack2.push(10);
    	stack2.push(20);
    	stack2.push(30);

    	// Obtenemos y mostramos el elemento en la cima de la pila de Strings
    	System.out.println("Elemento en la cima de la pila de Strings: " + stack1.top());

    	// Removemos y mostramos todos los elementos de la pila de enteros
    	while (!stack2.isEmpty()) {
    	    System.out.println("Elemento removido de la pila de enteros: " + stack2.pop());
    	}

    	// Verificamos si las pilas están vacías
    	System.out.println("La pila de Strings está vacía: " + stack1.isEmpty());
    	System.out.println("La pila de enteros está vacía: " + stack2.isEmpty());

    }
    
    
    }
