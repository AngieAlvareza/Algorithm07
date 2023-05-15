package ejercicio4;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la ruta al archivo: ");
        String ruta = scanner.nextLine();

        System.out.print("Ingrese los operadores en notación infija (separados por comas): ");
        String operadores = scanner.nextLine();

        System.out.print("Ingrese la expresión en notación infija: ");
        String expresion = scanner.nextLine();

        Polaca polaca = new Polaca(operadores.split(","));

        String[] resultado = polaca.readFile(ruta);

        System.out.println("Operaciones en notación postfija:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }

        System.out.println("Resultados: " + polaca.resultExpresion(expresion));
    }
}