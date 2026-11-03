/**
 * Programa que haya el tipo de triangulo que se forma con tres lados dados por el usuario.
 * Autor: Andres Felipe Gutierrez Rivera
 * Fecha: 2026-11-03
 */

import java.util.Scanner; // Importa la clase Scanner para leer datos por teclado

// Clase principal del programa
public class TriangulosJava {

    // Metodo principal: punto de entrada del programa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // Crea el objeto que lee desde la terminal
        double a, b, c;                           // Variables para los tres lados del triangulo

        // Se repite todo el proceso mientras el usuario desee continuar
        do {
            // Se piden los lados hasta que formen un triangulo valido
            while (true) {
                a = leerLado(teclado, "Ingrese el lado 1: "); // Lee el primer lado
                b = leerLado(teclado, "Ingrese el lado 2: "); // Lee el segundo lado
                c = leerLado(teclado, "Ingrese el lado 3: "); // Lee el tercer lado

                // Si los lados forman un triangulo valido, sale del ciclo de lectura
                if (esTrianguloValido(a, b, c)) {
                    break;
                }
                // Si no es valido, informa al usuario y el ciclo vuelve a pedir los lados
                System.out.println("Los lados ingresados no forman un triangulo valido. Intente de nuevo.\n");
            }

            // Muestra el tipo de triangulo segun sus lados
            System.out.println("El triangulo es " + tipoTriangulo(a, b, c) + ".");
        } while (deseaContinuar(teclado)); // Pregunta si se repite el programa

        System.out.println("Programa finalizado.");
        teclado.close(); // Libera el recurso del Scanner
    }

    // Lee un numero positivo por teclado, repitiendo hasta que la entrada sea correcta
    private static double leerLado(Scanner teclado, String mensaje) {
        while (true) {
            System.out.print(mensaje); // Muestra el mensaje solicitando el dato
            // Lee la linea, quita espacios y cambia la coma decimal por punto
            String linea = teclado.nextLine().trim().replace(',', '.');
            try {
                double valor = Double.parseDouble(linea); // Convierte el texto a numero
                // Acepta el valor solo si es positivo y finito
                if (valor > 0 && !Double.isInfinite(valor)) {
                    return valor; // Devuelve el lado valido
                }
                System.out.println("El lado debe ser un numero mayor que cero.");
            } catch (NumberFormatException e) {
                // El texto ingresado no se pudo convertir a numero
                System.out.println("Entrada invalida. Ingrese un numero.");
            }
        }
    }

    // Desigualdad triangular: cada lado debe ser menor que la suma de los otros dos
    private static boolean esTrianguloValido(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a; // true solo si se cumplen las tres condiciones
    }

    // Clasifica el triangulo segun la cantidad de lados iguales
    private static String tipoTriangulo(double a, double b, double c) {
        if (a == b && b == c) {                     // Los tres lados iguales
            return "equilatero";
        } else if (a == b || a == c || b == c) {    // Exactamente dos lados iguales
            return "isosceles";
        }
        return "escaleno";                          // Los tres lados diferentes
    }

    // Pregunta al usuario si desea continuar (S) o finalizar (N) la ejecucion
    private static boolean deseaContinuar(Scanner teclado) {
        while (true) {
            System.out.print("\nDesea continuar? (S = si, N = no): "); // Muestra la pregunta
            String respuesta = teclado.nextLine().trim().toUpperCase(); // Lee y normaliza a mayuscula
            if (respuesta.equals("S")) {
                System.out.println();   // Linea en blanco para separar las ejecuciones
                return true;            // Continua el programa
            } else if (respuesta.equals("N")) {
                return false;           // Finaliza el programa
            }
            System.out.println("Respuesta invalida. Escriba S o N."); // Repite la pregunta
        }
    }
}
