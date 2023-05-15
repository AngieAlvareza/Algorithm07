package ejercicio3;

import actividad3.PriorityQueue;
import ejercicio1.ExceptionIsEmpty;
import ejercicio3.PriorityQueueLinked;

public class Test {
    public static void main(String[] args) {
        // Crear una cola de prioridad con 3 niveles de prioridad
        PriorityQueue<String, Integer> pq = new PriorityQueueLinked<>(3);

        // Agregar elementos a la cola de prioridad
        pq.enqueue("Tarea 1", 2);
        pq.enqueue("Tarea 2", 1);
       // pq.enqueue("Tarea 3", 3);

        // Mostrar los elementos de la cola de prioridad
        System.out.println("Elementos de la cola de prioridad:");
        while (!pq.isEmpty()) {
            try {
                System.out.println(pq.dequeue());
            } catch (ExceptionIsEmpty e) {
                System.out.println("La cola de prioridad está vacía");
            }
        }
    }
}
