package ejercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Polaca {
    private String[] operaciones;

    public Polaca(String[] operaciones) {
        this.operaciones = operaciones;
    }

    public String[] readFile(String ruta) {
        try (Scanner sc = new Scanner(new File(ruta))) {
            StringBuilder texto = new StringBuilder();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] elementos = line.split(" ");
                texto.append(line).append("\n");
                for (String elemento : elementos) {
                    if (!elemento.isEmpty()) {
                        operaciones[operaciones.length - 1] = elemento;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo: " + ruta);
        }
        return operaciones;
    }

    public String inToPos(String operaciones) {
        // Implementación de la función inToPos
        return "";
    }

    public int calcula(String expresion) {
        // Implementación de la función calcula
        return 0;
    }

    public int resultExpresion(String expresion) {
        // Implementación de la función resultExpresion
        return 0;
    }
}