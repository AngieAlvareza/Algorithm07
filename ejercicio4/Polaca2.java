package ejercicio4;
//angieAlvareza Code
//Lab07
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import ejercicio1.ExceptionIsEmpty;
import ejercicio1.Stack;
import ejercicio1.StackLink;

public class Polaca2 {

    private static final Map<Character, Integer> precedencias = new HashMap<>();

    static {
        precedencias.put('+', 1);
        precedencias.put('-', 1);
        precedencias.put('*', 2);
        precedencias.put('/', 2);
        precedencias.put('S', 3);
    }

    public static void main(String[] args) {
        String rutaArchivo = "expresiones.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                String expresionInfija = linea.substring(1, linea.length() - 1);
                String expresionPosfija = inToPos(expresionInfija);
                int resultado = resultExpresion(expresionPosfija);
                System.out.println("Expresion Infija: " + expresionInfija);
                System.out.println("Expresion Posfija: " + expresionPosfija);
                System.out.println("Resultado: " + resultado);
                System.out.println("----------------------");
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String inToPos(String expresionInfija) throws ExceptionIsEmpty {
        Stack<Character> pila = new StackLink<>();
        StringBuilder expresionPosfija = new StringBuilder();
        for (int i = 0; i < expresionInfija.length(); i++) {
            char c = expresionInfija.charAt(i);
            if (Character.isDigit(c)) {
                expresionPosfija.append(c);
            } else if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                while (!pila.isEmpty() && pila.top() != '(') {
                    expresionPosfija.append(pila.pop());
                }
                pila.pop(); // Descartar el '(' de la pila
            } else {
                while (!pila.isEmpty() && precedencias.get(c) <= precedencias.get(pila.top())) {
                    expresionPosfija.append(pila.pop());
                }
                pila.push(c);
            }
        }
        while (!pila.isEmpty()) {
            expresionPosfija.append(pila.pop());
        }
        return expresionPosfija.toString();
    }

    public static int resultExpresion(String expresionPosfija) throws ExceptionIsEmpty {
        Stack<Integer> pila = new StackLink<>();
        for (int i = 0; i < expresionPosfija.length(); i++) {
            char c = expresionPosfija.charAt(i);
            if (Character.isDigit(c)) {
                pila.push(Character.getNumericValue(c));
            } else {
                int b = pila.pop();
                int a = pila.pop();
                int resultado;
                switch (c) {
                    case '+':
                        resultado = a + b;
                        break;
                    case '-':
                        resultado = a - b;
                        break;
                    case '*':
                        resultado = a * b;
                        break;
                    case '/':
                        resultado = a / b;
                        break;
                    case 'S':
                        resultado = (int) Math.pow(a, b);
                        break;
                    default:
                        throw new IllegalArgumentException("Operador inválido: " + c);
                }
                pila.push(resultado);
            }
        }
        return pila.pop();
    }
}
