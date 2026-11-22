package ejercicio4;

import java.util.Scanner;

/**
 * @author [Leyton Joao Lalangui Herrera]
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;

        System.out.println("Ingrese la nota del estudiante:");
        nota = scanner.nextDouble();

        if (nota >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
