package ejercicio2;

import actividad2.Queque;
import ejercicio1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) throws ExceptionIsEmpty {
        // Creamos una cola de tamaño máximo 5
        Queque<Integer> cola = new QueueArray<>(5);

        // Insertamos algunos elementos en la cola
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        // Mostramos el elemento del frente de la cola
        System.out.println("Elemento del frente de la cola: " + cola.front());

        // Eliminamos el elemento del frente de la cola
        cola.dequeue();

        // Insertamos un nuevo elemento en la cola
        cola.enqueue(40);

        // Mostramos todos los elementos de la cola
        System.out.println("Elementos de la cola: " + cola.toString());
    }
}
