package actividad3;

import actividad3.PriorityQueueLinkSort;
import ejercicio1.ExceptionIsEmpty;

public class Test {
    public static void main(String[] args) throws ExceptionIsEmpty {
        PriorityQueueLinkSort<String, Integer> pq = new PriorityQueueLinkSort<>();
        
        pq.enqueue("John", 2);
        pq.enqueue("Alice", 1);
        pq.enqueue("Bob", 3);
        pq.enqueue("Emily", 4);
        
        System.out.println("Front: " + pq.front()); // Alice
        System.out.println("Back: " + pq.back()); // Emily
        System.out.println("Dequeue: " + pq.dequeue()); // Alice
        System.out.println("IsEmpty: " + pq.isEmpty()); // false
        
        pq.enqueue("Lucy", 1);
        pq.enqueue("Michael", 2);
        pq.enqueue("Daniel", 2);
        
        System.out.println("Dequeue: " + pq.dequeue()); // Lucy
        System.out.println("Dequeue: " + pq.dequeue()); // Michael
        System.out.println("Dequeue: " + pq.dequeue()); // Daniel
        
        try {
            System.out.println("Front: " + pq.front());
        } catch (ExceptionIsEmpty e) {
            System.out.println("ExceptionIsEmpty: " + e.getMessage()); // ExceptionIsEmpty
        }
    }
}
