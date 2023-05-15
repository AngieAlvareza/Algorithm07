package ejercicio4;
//AngieAlvareza Code
//LAb07
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import ejercicio1.ExceptionIsEmpty;

public class Main3 {
    public static void main(String[] args) throws ExceptionIsEmpty {
        String path = "D:/UCSM/hi.txt";
        Polaca2 polaca = new Polaca2();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();
            while (line != null) {
                String postfija = polaca.inToPos(line);
                int resultado = polaca.resultExpresion(postfija);
                System.out.println("Expresión infija: " + line);
                System.out.println("Expresión postfija: " + postfija);
                System.out.println("Resultado: " + resultado);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
