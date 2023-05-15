package ejercicio1;
//@AngieAlvareza code
//Lab07 AED05

public class ExceptionIsEmpty extends Exception {
    public ExceptionIsEmpty() {
        super("La pila está vacía.");
    }
}
