package ejercicio4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ruta = "D:/UCSM/hi.txt";
        Polaca polaca = new Polaca(new String[]{"suma", "multiplicacion", "restringida"});
        String[] resultado = polaca.readFile(ruta);
        System.out.println("Operaciones en notación postfija:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
        System.out.println("Resultados: " + polaca.resultExpresion("(4+5*6)"));
    }
}
