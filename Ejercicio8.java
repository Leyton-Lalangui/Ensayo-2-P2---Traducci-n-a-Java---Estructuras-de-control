package ejercicio8;

import java.util.Scanner;

/**
 * @author [Leyton Joao Lalangui Herrera]
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String contrasenaCorrecta = "java2026";
        String contrasenaIngresada;

        do {
            System.out.println("Ingrese la contrasena:");
            contrasenaIngresada = scanner.nextLine();
        } while (!contrasenaIngresada.equals(contrasenaCorrecta));

        System.out.println("Acceso concedido.");
    }
}
