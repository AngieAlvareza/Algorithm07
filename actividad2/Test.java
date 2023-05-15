package actividad2;

import ejercicio1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) throws ExceptionIsEmpty {
        // Crear una cola de enteros
        Queque<Integer> intQueue = new QueueLink<>();
        System.out.println("La cola de enteros está vacía? " + intQueue.isEmpty()); // debería imprimir true

        // Agregar elementos a la cola de enteros
        intQueue.enqueue(5);
        intQueue.enqueue(10);
        intQueue.enqueue(15);

        // Verificar el frente y el final de la cola de enteros
        System.out.println("El frente de la cola de enteros es: " + intQueue.front()); // debería imprimir 5
        System.out.println("El final de la cola de enteros es: " + intQueue.back()); // debería imprimir 15

        // Mostrar la cola de enteros
        System.out.println("La cola de enteros es: " + intQueue); // debería imprimir "5 10 15"

        // Eliminar elementos de la cola de enteros
        intQueue.dequeue();
        intQueue.dequeue();

        // Verificar el frente y el final de la cola de enteros
        System.out.println("El frente de la cola de enteros es: " + intQueue.front()); // debería imprimir 15
        System.out.println("El final de la cola de enteros es: " + intQueue.back()); // debería imprimir 15

        // Mostrar la cola de enteros
        System.out.println("La cola de enteros es: " + intQueue); // debería imprimir "15"

        // Crear una cola de cadenas de texto
        Queque<String> stringQueue = new QueueLink<>();
        System.out.println("La cola de cadenas de texto está vacía? " + stringQueue.isEmpty()); // debería imprimir true

        // Agregar elementos a la cola de cadenas de texto
        stringQueue.enqueue("Hola");
        stringQueue.enqueue("Mundo");
        stringQueue.enqueue("!");

        // Verificar el frente y el final de la cola de cadenas de texto
        System.out.println("El frente de la cola de cadenas de texto es: " + stringQueue.front()); // debería imprimir "Hola"
        System.out.println("El final de la cola de cadenas de texto es: " + stringQueue.back()); // debería imprimir "!"

        // Mostrar la cola de cadenas de texto
        System.out.println("La cola de cadenas de texto es: " + stringQueue); // debería imprimir "Hola Mundo !"

        // Eliminar elementos de la cola de cadenas de texto
        stringQueue.dequeue();
        stringQueue.dequeue();

        // Verificar el frente y el final de la cola de cadenas de texto
        System.out.println("El frente de la cola de cadenas de texto es: " + stringQueue.front()); // debería imprimir "!"
        System.out.println("El final de la cola de cadenas de texto es: " + stringQueue.back()); // debería imprimir "!"

        // Mostrar la cola de cadenas de texto
        System.out.println("La cola de cadenas de texto es: " + stringQueue); // debería imprimir "!"
    }
}
